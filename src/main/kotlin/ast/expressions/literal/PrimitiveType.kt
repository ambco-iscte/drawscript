package ast.expressions.literal

import ast.expressions.Expression
import ast.expressions.literal.Number
import ast.expressions.literal.*

/**
 * Interface representing "primitive" [Expression]s, i.e. [Number]s, [Bool]s, [Colour]s, [Point]s, and [Interval]s.
 */
sealed interface PrimitiveType: Expression