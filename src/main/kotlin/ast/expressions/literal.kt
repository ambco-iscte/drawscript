package ast.expressions

import kotlin.Boolean

data class Number(val value: Int): Expression {
    override fun toString(): String = "$value"
}

data class Bool(val value: Boolean): Expression {
    override fun toString(): String = "$value"
}

data class ConstantReference(val identifier: String): Expression {
    override fun getReferencedConstantIdentifiers(): List<String> = listOf(identifier)

    override fun toString(): String = identifier
}

data class Colour(val red: Expression, val green: Expression, val blue: Expression): Expression {
    override fun getReferencedConstantIdentifiers(): List<String> =
        red.getReferencedConstantIdentifiers() + green.getReferencedConstantIdentifiers() + blue.getReferencedConstantIdentifiers()

    override fun toString(): String = "|$red|$green|$blue|"
}

data class Point(val x: Expression, val y: Expression): Expression {
    override fun getReferencedConstantIdentifiers(): List<String> =
        x.getReferencedConstantIdentifiers() + y.getReferencedConstantIdentifiers()

    override fun toString(): String = "($x, $y)"
}

data class Interval(val start: Expression, val end: Expression, val type: IntervalType): Expression {
    enum class IntervalType {
        OPEN,
        CLOSED,
        RIGHT_OPEN,
        LEFT_OPEN;
    }

    override fun getReferencedConstantIdentifiers(): List<String> =
        start.getReferencedConstantIdentifiers() + end.getReferencedConstantIdentifiers()

    override fun toString(): String = when (type) {
        IntervalType.OPEN -> "]$start, $end["
        IntervalType.CLOSED -> "[$start, $end]"
        IntervalType.LEFT_OPEN -> "]$start, $end]"
        IntervalType.RIGHT_OPEN -> "[$start, $end["
    }
}