package ast

import ast.expressions.*
import ast.expressions.Number
import ast.instructions.*
import ast.validation.InvalidColorRGBValues
import ast.validation.InvalidReferenceType
import ast.validation.SemanticError
import java.awt.Color
import java.awt.Dimension

/**
 * Abstract DrawScript script.
 * @param constants Constants defined within the scope of the script.
 * @param dimension Display window dimension. Default: (100, 100).
 * @param backgroundColour Display window background color. Default: [Color.WHITE].
 * @param instructions List of script [Instruction]s.
 */
data class Script(
    val constants: Map<String, Expression>,
    val dimension: Dimension = Dimension(100, 100),
    val backgroundColour: Color = Color.WHITE,
    val instructions: List<Instruction>
) {

    /**
     * Validates the script, outputting a list of [SemanticError]s.
     */
    fun validate(): List<SemanticError> {
        val errors = mutableListOf<SemanticError>()
        instructions.forEach { errors.addAll(validate(it)) }
        return errors
    }

    /**
     * Is the script valid? That is, are there no [SemanticError]s in it?
     * @see [validate]
     */
    fun isValid(): Boolean = validate().isNotEmpty()

    /**
     * "Solves" a DrawScript [Expression], effectively simplifying it as much as possible.
     * @param expr The expression to solve.
     */
    private fun solve(expr: Expression): Expression = when (expr) {
        is ConstantReference -> constants[expr.identifier]!!
        is Colour -> Colour(solve(expr.red), solve(expr.green), solve(expr.blue))
        is Point -> Point(solve(expr.x), solve(expr.y))
        is Interval -> Interval(solve(expr.start), solve(expr.end), expr.type)
        is BinaryExpression -> expr.operator.apply(solve(expr.left), solve(expr.right))
        else -> expr
    }

    /**
     * Validates a DrawScript [Instruction], outputting a list of [SemanticError]s.
     * @param instruction The [Instruction] to validate.
     */
    private fun validate(instruction: Instruction): List<SemanticError> = when (instruction) {
        is SetLineColour -> validate(instruction.colour)
        is SetFillColour -> validate(instruction.colour)
        is Branch -> {
            val errors = mutableListOf<SemanticError>()
            errors.addAll(validate(instruction.expr))
            instruction.body.forEach { errors.addAll(validate(it)) }
            instruction.alternative.forEach { errors.addAll(validate(it)) }
            errors
        }
        is Iteration -> {
            val errors = mutableListOf<SemanticError>()
            instruction.body.forEach { errors.addAll(validate(it)) }
            errors
        }
        else -> listOf()
    }

    /**
     * Validates a DrawScript [Expression], outputting a list of [SemanticError]s.
     */
    private fun validate(expr: Expression): List<SemanticError> = when (expr) {
        is ConstantReference -> validate(constants[expr.identifier]!!)
        is Colour -> {
            val errors = mutableListOf<SemanticError>()

            val red = solve(expr.red)
            val green = solve(expr.red)
            val blue = solve(expr.red)

            // Check if colour is defined with non-integer parameter expressions
            listOf(red, green, blue).forEach {
                if (it !is Number)
                    errors.add(InvalidReferenceType(Number::class, it::class, expr))
            }

            // Check that the RGB values are all in [0, 255]
            val r = red as Number
            val g = green as Number
            val b = blue as Number
            if (r.value !in 0..255 || g.value !in 0..255 || b.value !in 0..255)
                errors.add(InvalidColorRGBValues(r.value, g.value, b.value, expr))

            errors
        }
        is Point -> {
            TODO ("Point expression validation not yet implemented")
        }
        is Interval -> {
            TODO("Interval expression validation not yet implemented")
        }
        is BinaryExpression -> {
            TODO("Binary expression validation not yet implemented")
        }
        else -> listOf() // Number and Bool will never have any errors, they're super simple
    }
}