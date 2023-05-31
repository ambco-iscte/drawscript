package ast.instructions.figure

import ast.expressions.Expression
import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws a circle with a given [radius] and [center] [Point].
 * @param center The center [Point] of the circle.
 * @param radius An [Expression] representing the radius of the circle.
 */
data class Circle(override val center: Point, val radius: Expression): Ellipse(center, radius, radius) {
    override fun toString(): String = "${indentation}circle $center, $radius"
}