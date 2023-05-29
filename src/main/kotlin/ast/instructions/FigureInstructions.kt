package ast.instructions

import ast.expressions.Expression
import ast.expressions.Point

open class FigureInstruction(open val start: Point): Instruction {
    override var parent: Instruction? = null
}

data class Line(override val start: Point, val end: Point): FigureInstruction(start) {
    override fun toString(): String = "${indentation}line $start, $end"
}

open class Rectangle(override val start: Point, val width: Expression, val height: Expression): FigureInstruction(start) {
    override fun toString(): String = "${indentation}rectangle $start, ${width}x$height"
}

data class Square(override val start: Point, val length: Expression): Rectangle(start, length, length) {
    override fun toString(): String = "${indentation}square $start, $length"
}

open class Ellipse(open val center: Point, val width: Expression, val height: Expression): FigureInstruction(center) {
    override fun toString(): String = "${indentation}ellipse $center, ${width}x$height"
}

data class Circle(override val center: Point, val radius: Expression): Ellipse(center, radius, radius) {
    override fun toString(): String = "${indentation}circle $center, $radius"
}

data class Polyline(override val start: Point, val points: List<Point>): FigureInstruction(start) {
    override fun toString(): String =
        if (points.isNotEmpty()) "${indentation}polyline $start, ${points.joinToString(", ")}"
        else "${indentation}polyline $start"
}