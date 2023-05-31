package ast.instructions.figure

import ast.expressions.Expression
import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws an ellipse with a given [width], [height], and [center] [Point].
 * @param center The center [Point] of the ellipse.
 * @param width An [Expression] representing the width of the ellipse.
 * @param height An [Expression] representing the height of the ellipse.
 */
open class Ellipse(open val center: Point, val width: Expression, val height: Expression): FigureInstruction(center) {
    override fun toString(): String = "${indentation}ellipse $center, ${width}x$height"
}