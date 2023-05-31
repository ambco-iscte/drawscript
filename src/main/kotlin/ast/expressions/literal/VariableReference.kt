package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] that references a variable through its string [identifier].
 */
data class VariableReference(val identifier: String): Expression {
    override fun getReferencedVariableIdentifiers(): List<String> = listOf(identifier)

    override fun toString(): String = identifier
}