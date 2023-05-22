package ast.instructions

import ast.DDimension
import ast.Point
import ast.expressions.Expression

sealed interface Instruction

sealed interface IContainExpression {
    val expr: Expression
}

sealed class FigureInstruction(open val start: Point): Instruction

data class LineInstruction(override val start: Point, val end: Point): FigureInstruction(start)

sealed class RectangleInstruction(override val start: Point, val dimension: DDimension): FigureInstruction(start)

data class SquareInstruction(override val start: Point, val width: Int): RectangleInstruction(start, DDimension(width, width))

sealed class EllipseInstruction(open val center: Point, val dimension: DDimension): FigureInstruction(center)

data class CircleInstruction(override val center: Point, val radius: Int): EllipseInstruction(center, DDimension(radius, radius))

data class ArbitraryFigureInstruction(override val start: Point, val points: List<Point>): FigureInstruction(start)