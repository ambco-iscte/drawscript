package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] to represent the interval of integers from [start] to [end].
 * @param start An [Expression] representing the starting point of the interval.
 * @param end An [Expression] representing the end point of the interval.
 * @param type The interval type, i.e. Open, Closed, RightOpen, and LeftOpen.
 */
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