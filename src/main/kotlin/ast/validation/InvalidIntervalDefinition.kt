package ast.validation

import ast.expressions.literal.Interval

/**
 * [SemanticError] thrown when an [Interval]'s start and end values are invalid (start > end).
 * @param interval [Interval] that contains the wrong values.
 */
data class InvalidIntervalDefinition(val interval: Interval):
    SemanticError("Invalid interval definition $interval: lower bound must be less than or equal to the upper bound")