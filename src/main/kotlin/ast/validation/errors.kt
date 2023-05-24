package ast.validation

import ast.expressions.BinaryExpression
import ast.expressions.Expression
import ast.expressions.ExpressionType
import ast.expressions.Interval

sealed class SemanticError(val message: String) {
    override fun toString(): String = message
}

data class UndefinedConstantReference(val identifier: String, val source: Expression):
    SemanticError("Referenced undefined constant $identifier\n\tcause: $source")

data class InvalidIntervalDefinition(val interval: Interval):
    SemanticError("Invalid interval definition $interval: lower bound must be less than or equal to the upper bound")

data class InvalidColorRGBValues(val r: Int, val g: Int, val b: Int, val source: Expression):
    SemanticError("Invalid colour: ($r, $g, $b). RGB values must be between 0 and 255 (both inclusive).\n\tcause: $source")

data class InvalidReferenceType(val expected: List<ExpressionType>, val actual: ExpressionType, val source: Expression):
    SemanticError("Invalid expression type reference: expected one of <${expected.joinToString(", ")}}>, got <${actual.name}>\n\tcause: $source")

data class InvalidBinaryExpressionOperatorContext(val source: BinaryExpression):
        SemanticError("Invalid expression relation ${source.operator.name} for operands <${source.left}>, <${source.right}>\n\tcause: $source")