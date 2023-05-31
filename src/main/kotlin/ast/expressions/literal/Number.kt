package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] to represent an integer [value].
 * @param value An integer value.
 */
data class Number(val value: Int): PrimitiveType {
    override fun toString(): String = "$value"
}