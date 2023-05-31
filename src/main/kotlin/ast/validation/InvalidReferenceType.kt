package ast.validation

import ast.expressions.*
import ast.expressions.Expression.ExpressionType as ExpressionType

/**
 * [SemanticError] thrown when an [Expression] is used where another [ExpressionType] was expected.
 * @param expected A list of possible expected [ExpressionType]s.
 * @param actual The incorrect [ExpressionType] that was provided.
 * @param source The [Expression] that threw the error.
 */
data class InvalidReferenceType(val expected: List<ExpressionType>, val actual: ExpressionType, val source: Expression):
    SemanticError("Invalid expression type reference: expected one of <${expected.joinToString(", ")}}>, got <${actual.name}>\n\tcause: $source")