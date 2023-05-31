package ast.instructions.figure

import ast.expressions.Expression
import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws a square with a given side [length] [start]ing from its top left [Point].
 * @param start The top-left [Point] of the square.
 * @param length An [Expression] representing the side length of the square.
 */
data class Square(override val start: Point, val length: Expression): Rectangle(start, length, length) {
    override fun toString(): String = "${indentation}square $start, $length"
}