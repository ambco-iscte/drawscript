package ast.validation

import ast.expressions.binary.BinaryExpression

/**
 * [SemanticError] thrown when a [BinaryExpression] is ill-defined.
 * @param source The ill-defined [BinaryExpression].
 */
data class InvalidBinaryExpressionOperatorContext(val source: BinaryExpression):
    SemanticError("Invalid expression relation ${source.operator.name} for operands <${source.left}>, <${source.right}>\n\tcause: $source")