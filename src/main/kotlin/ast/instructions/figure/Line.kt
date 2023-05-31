package ast.instructions.figure

import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws a line between the [start] and [end] [Point]s.
 * @param start The starting [Point] of the line.
 * @param end The end [Point] of the line.
 */
data class Line(override val start: Point, val end: Point): FigureInstruction(start) {
    override fun toString(): String = "${indentation}line $start, $end"
}