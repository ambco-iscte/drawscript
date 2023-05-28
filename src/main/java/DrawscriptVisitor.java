// Generated from D:/Mestrado/Engenharia de Linguagens de Programação/drawscript/src\Drawscript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawscriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DrawscriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(DrawscriptParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DrawscriptParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(DrawscriptParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(DrawscriptParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code line}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DrawscriptParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rectangle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(DrawscriptParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code square}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(DrawscriptParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ellipse}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipse(DrawscriptParser.EllipseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code circle}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(DrawscriptParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code polyline}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolyline(DrawscriptParser.PolylineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setLineColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLineColour(DrawscriptParser.SetLineColourContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setFillColour}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetFillColour(DrawscriptParser.SetFillColourContext ctx);
	/**
	 * Visit a parse tree produced by the {@code branch}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(DrawscriptParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iteration}
	 * labeled alternative in {@link DrawscriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(DrawscriptParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(DrawscriptParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(DrawscriptParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointExpression(DrawscriptParser.PointExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(DrawscriptParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(DrawscriptParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colourExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColourExpression(DrawscriptParser.ColourExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link DrawscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(DrawscriptParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DrawscriptParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(DrawscriptParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(DrawscriptParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#colour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColour(DrawscriptParser.ColourContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DrawscriptParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawscriptParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(DrawscriptParser.ReferenceContext ctx);
}