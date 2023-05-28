package ast.expressions

import kotlin.Boolean

sealed interface PrimitiveType: Expression

data class Number(val value: Int): PrimitiveType {
    override fun toString(): String = "$value"
}

data class Bool(val value: Boolean): PrimitiveType {
    override fun toString(): String = "$value"
}

data class ConstantReference(val identifier: String): Expression {
    override fun toString(): String = identifier
}

data class Colour(val red: Expression, val green: Expression, val blue: Expression): PrimitiveType {
    override fun getReferencedVariableIdentifiers(): List<String> =
        red.getReferencedVariableIdentifiers() + green.getReferencedVariableIdentifiers() + blue.getReferencedVariableIdentifiers()

    override fun toString(): String = "|$red|$green|$blue|"
}

data class Point(val x: Expression, val y: Expression): PrimitiveType {
    override fun getReferencedVariableIdentifiers(): List<String> =
        x.getReferencedVariableIdentifiers() + y.getReferencedVariableIdentifiers()

    override fun toString(): String = "($x, $y)"
}

data class Interval(val start: Expression, val end: Expression, val type: IntervalType): PrimitiveType {
    enum class IntervalType {
        OPEN,
        CLOSED,
        RIGHT_OPEN,
        LEFT_OPEN;
    }

    override fun getReferencedVariableIdentifiers(): List<String> =
        start.getReferencedVariableIdentifiers() + end.getReferencedVariableIdentifiers()

    override fun toString(): String = when (type) {
        IntervalType.OPEN -> "]$start, $end["
        IntervalType.CLOSED -> "[$start, $end]"
        IntervalType.LEFT_OPEN -> "]$start, $end]"
        IntervalType.RIGHT_OPEN -> "[$start, $end["
    }
}

data class VariableReference(val identifier: String): Expression {
    override fun getReferencedVariableIdentifiers(): List<String> = listOf(identifier)

    override fun toString(): String = identifier
}