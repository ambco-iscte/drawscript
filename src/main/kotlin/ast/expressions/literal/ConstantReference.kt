package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] that references a constant through its string [identifier].
 */
data class ConstantReference(val identifier: String): Expression {
    override fun toString(): String = identifier
}