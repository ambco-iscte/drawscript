package ast.validation

import ast.expressions.Expression
import kotlin.reflect.KClass

sealed class SemanticError(override val message: String): Throwable(message) {
    override fun toString(): String = message
}

data class DuplicatedConstantIdentifier(val id: String):
    SemanticError("Duplicate constant identifier: $id")

data class InvalidColorRGBValues(val r: Int, val g: Int, val b: Int, val source: Expression):
    SemanticError("Invalid colour: ($r, $g, $b). RGB values must be between 0 and 255 (both inclusive).\n\tcause: $source")

data class InvalidReferenceType(val expected: KClass<*>, val actual: KClass<*>, val source: Expression):
    SemanticError("Invalid expression type reference: expected <${expected.simpleName}>, got <${actual.simpleName}>\n\tcause: $source")