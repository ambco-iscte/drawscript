package parsing

import antlr.DrawscriptLexer
import antlr.DrawscriptParser
import ast.Script
import ast.expressions.*
import ast.expressions.literal.*
import ast.expressions.literal.Number
import ast.expressions.binary.*
import ast.instructions.*
import ast.instructions.figure.*
import ast.instructions.colour.*
import ast.instructions.control.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

/**
 * Helper class that projects a DrawScript-formatted String into a [Script].
 * @param script The DrawString-formatted script.
 */
internal class ASTProjector(private val script: String) {
    private val definedConstants: MutableList<String> = mutableListOf()

    companion object {
        /**
         * Reads a DrawScript-formatted file and returns an [ASTProjector] for that script.
         */
        fun read(file: String): ASTProjector = ASTProjector(File(file).readText())
    }

    /**
     * Constructs a [Script] from the string passed when constructing this [ASTProjector] instance.
     */
    fun project(): Script =
        DrawscriptParser(
            CommonTokenStream(
                DrawscriptLexer(
                    CharStreams.fromString(
                        script
                    )
                )
            )
        ).script().toAbstract()

    private fun DrawscriptParser.ScriptContext.toAbstract(): Script {
        val constants = constants().toMap()
        definedConstants.addAll(constants.keys)
        return Script(
            constants,
            parameters().dim.toAbstract(),
            parameters().bg.toAbstract(),
            sequence().toInstructionList()
        )
    }

    private fun DrawscriptParser.SequenceContext.toInstructionList(): List<Instruction> = instruction().map { it.toAbstract() }

    private fun DrawscriptParser.ConstantsContext.toMap(): Map<String, Expression> {
        val map: MutableMap<String, Expression> = mutableMapOf()
        definition().forEach { map[it.IDENTIFIER().text] = it.expression().toAbstract() }
        return map
    }

    private fun DrawscriptParser.DimensionContext.toAbstract(): Expression =
        if (point() != null) point().toAbstract()
        else if (reference() != null) reference().toAbstract()
        else throw DrawScriptParseException("Invalid dimension context token!")

    private fun DrawscriptParser.BackgroundContext.toAbstract(): Expression =
        if (colour() != null) colour().toAbstract()
        else if (reference() != null) reference().toAbstract()
        else throw DrawScriptParseException("Invalid background context token!")

    private fun DrawscriptParser.InstructionContext.toAbstract(): Instruction = when (this) {
        is DrawscriptParser.LineContext -> Line(start.toAbstract(), end.toAbstract())
        is DrawscriptParser.RectangleContext -> Rectangle(start.toAbstract() , width.toAbstract(), height.toAbstract())
        is DrawscriptParser.SquareContext -> Square(start.toAbstract(),length.toAbstract())
        is DrawscriptParser.EllipseContext -> Ellipse(center.toAbstract(), width.toAbstract(),height.toAbstract())
        is DrawscriptParser.CircleContext -> Circle(center.toAbstract(), radius.toAbstract())
        is DrawscriptParser.PolylineContext -> Polyline(start.toAbstract(), points.map { it.toAbstract() })
        is DrawscriptParser.SetLineColourContext -> SetLineColour(color.toAbstract())
        is DrawscriptParser.SetFillColourContext -> SetFillColour(color.toAbstract())
        is DrawscriptParser.BranchContext -> Branch(guard.toAbstract(), then.toInstructionList(), else_.toInstructionList())
        is DrawscriptParser.IterationContext -> Iteration(
            interval()!!.toAbstract(),
            VariableReference(IDENTIFIER().text),
            body.toInstructionList()
        )
        else -> throw DrawScriptParseException("Invalid instruction context!")
    }

    private fun DrawscriptParser.PointContext.toAbstract(): Point = Point(x.toAbstract(), y.toAbstract())

    private fun DrawscriptParser.ColourContext.toAbstract(): Colour =
        if (rgb != null) Colour(rgb.toAbstract(), rgb.toAbstract(), rgb.toAbstract())
        else Colour(red.toAbstract(), green.toAbstract(), blue.toAbstract())

    private fun DrawscriptParser.NumberContext.toAbstract(): Number = Number(value.text.toInt())

    private fun DrawscriptParser.BooleanContext.toAbstract(): Bool = Bool(value.text.toBoolean())

    private fun DrawscriptParser.IntervalContext.toAbstract(): Interval = when (this) {
        is DrawscriptParser.ClosedIntervalContext -> Interval(start.toAbstract(), end.toAbstract(), Interval.IntervalType.CLOSED)
        is DrawscriptParser.OpenIntervalContext -> Interval(start.toAbstract(), end.toAbstract(), Interval.IntervalType.OPEN)
        is DrawscriptParser.LeftOpenIntervalContext -> Interval(start.toAbstract(), end.toAbstract(), Interval.IntervalType.LEFT_OPEN)
        is DrawscriptParser.RightOpenIntervalContext -> Interval(start.toAbstract(), end.toAbstract(), Interval.IntervalType.RIGHT_OPEN)
        else -> throw DrawScriptParseException("Invalid interval context!")
    }

    private fun DrawscriptParser.ReferenceContext.toAbstract(): Expression =
        if (definedConstants.contains(id.text)) ConstantReference(id.text)
        else VariableReference(id.text)

    private fun DrawscriptParser.ExpressionContext.toAbstract(): Expression = when (this) {
        is DrawscriptParser.EnclosedExpressionContext -> expression()!!.toAbstract()
        is DrawscriptParser.NumberExpressionContext -> number()!!.toAbstract()
        is DrawscriptParser.BooleanExpressionContext -> boolean_()!!.toAbstract()
        is DrawscriptParser.ColourExpressionContext -> colour()!!.toAbstract()
        is DrawscriptParser.PointExpressionContext -> point()!!.toAbstract()
        is DrawscriptParser.IntervalExpressionContext -> interval()!!.toAbstract()
        is DrawscriptParser.ReferenceExpressionContext -> reference()!!.toAbstract()
        is DrawscriptParser.BinaryExpressionRelationalContext ->
            BinaryExpression(left.toAbstract(), BinaryOperator.parse(operator.text), right.toAbstract())
        is DrawscriptParser.BinaryExpressionPowContext ->
            BinaryExpression(left.toAbstract(), BinaryOperator.parse(operator.text), right.toAbstract())
        is DrawscriptParser.BinaryExpressionMulDivModContext ->
            BinaryExpression(left.toAbstract(), BinaryOperator.parse(operator.text), right.toAbstract())
        is DrawscriptParser.BinaryExpressionAddSubContext ->
            BinaryExpression(left.toAbstract(), BinaryOperator.parse(operator.text), right.toAbstract())
        else -> throw DrawScriptParseException("Invalid expression context!")
    }
}