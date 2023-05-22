package ast

typealias Point = Pair<Int, Int>

typealias Colour = Triple<Int, Int, Int>

sealed interface ValueType

sealed class Literal(open val value: Any): ValueType

data class DInteger(override val value: Int): Literal(value)

data class DBoolean(override val value: Boolean): Literal(value)

data class DPoint2D(val x: Int, val y: Int): Literal(Point(x, y))

data class DDimension(val width: Int, val height: Int): Literal(Point(width, height))

data class DInterval(val start: Int, val end: Int): Literal(Point(start, end))

data class DColour(val r: Int, val g: Int, val b: Int): Literal(Colour(r, g, b))
