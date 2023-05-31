package ast.instructions.figure

import ast.expressions.literal.Point
import ast.instructions.indentation
import ast.instructions.Instruction

/**
 * [Instruction] that draws a polyline from a given [start] [Point] and a list of [points].
 * @param start The starting [Point] of the polyline.
 * @param points A list of [Point]s.
 */
data class Polyline(override val start: Point, val points: List<Point>): FigureInstruction(start) {
    override fun toString(): String =
        if (points.isNotEmpty()) "${indentation}polyline $start, ${points.joinToString(", ")}"
        else "${indentation}polyline $start"
}