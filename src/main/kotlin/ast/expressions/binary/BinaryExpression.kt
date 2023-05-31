package ast.expressions.binary

import ast.expressions.Expression

/**
 * Binary [Expression]. Takes an [operator] and combines two operand [Expression]s.
 * @param left The left [Expression] operand of the binary expression.
 * @param right The right [Expression] operand of the binary expression.
 * @param operator The [BinaryOperator] that applies to the two operands.
 */
data class BinaryExpression(val left: Expression, val operator: BinaryOperator, val right: Expression): Expression {
    override fun getReferencedVariableIdentifiers(): List<String> =
        left.getReferencedVariableIdentifiers() + right.getReferencedVariableIdentifiers()

    override fun toString(): String = "$left $operator $right"
}