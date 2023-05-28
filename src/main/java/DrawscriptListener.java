// Generated from D:/Mestrado/Engenharia de Linguagens de Programação/drawscript/src\Drawscript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawscriptParser}.
 */
public interface DrawscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DrawscriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DrawscriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(DrawscriptParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(DrawscriptParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DrawscriptParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DrawscriptParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(DrawscriptParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(DrawscriptParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(DrawscriptParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(DrawscriptParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code line}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLine(DrawscriptParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code line}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLine(DrawscriptParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rectangle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRectangle(DrawscriptParser.RectangleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rectangle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRectangle(DrawscriptParser.RectangleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code square}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSquare(DrawscriptParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code square}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSquare(DrawscriptParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ellipse}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterEllipse(DrawscriptParser.EllipseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ellipse}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitEllipse(DrawscriptParser.EllipseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code circle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCircle(DrawscriptParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code circle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCircle(DrawscriptParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code polyline}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPolyline(DrawscriptParser.PolylineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code polyline}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPolyline(DrawscriptParser.PolylineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setLineColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSetLineColour(DrawscriptParser.SetLineColourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setLineColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSetLineColour(DrawscriptParser.SetLineColourContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setFillColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSetFillColour(DrawscriptParser.SetFillColourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setFillColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSetFillColour(DrawscriptParser.SetFillColourContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branch}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBranch(DrawscriptParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branch}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBranch(DrawscriptParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIteration(DrawscriptParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIteration(DrawscriptParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(DrawscriptParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(DrawscriptParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(DrawscriptParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(DrawscriptParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPointExpression(DrawscriptParser.PointExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPointExpression(DrawscriptParser.PointExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(DrawscriptParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(DrawscriptParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(DrawscriptParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(DrawscriptParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colourExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterColourExpression(DrawscriptParser.ColourExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colourExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitColourExpression(DrawscriptParser.ColourExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(DrawscriptParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(DrawscriptParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DrawscriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DrawscriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(DrawscriptParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(DrawscriptParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(DrawscriptParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(DrawscriptParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#colour}.
	 * @param ctx the parse tree
	 */
	void enterColour(DrawscriptParser.ColourContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#colour}.
	 * @param ctx the parse tree
	 */
	void exitColour(DrawscriptParser.ColourContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DrawscriptParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DrawscriptParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawscriptParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(DrawscriptParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawscriptParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(DrawscriptParser.ReferenceContext ctx);
}