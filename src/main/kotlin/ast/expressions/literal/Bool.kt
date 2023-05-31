package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] to represent a boolean [value].
 * @param value A boolean value.
 */
data class Bool(val value: Boolean): PrimitiveType {
    override fun toString(): String = "$value"
}