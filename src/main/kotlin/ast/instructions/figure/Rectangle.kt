package ast.instructions.figure

import ast.expressions.Expression
import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws a rectangle with a given [width] and [height] [start]ing from its top left [Point].
 * @param start The top-left [Point] of the rectangle.
 * @param width An [Expression] representing the width of the rectangle.
 * @param height An [Expression] representing the height of the rectangle.
 */
open class Rectangle(override val start: Point, val width: Expression, val height: Expression): FigureInstruction(start) {
    override fun toString(): String = "${indentation}rectangle $start, ${width}x$height"
}