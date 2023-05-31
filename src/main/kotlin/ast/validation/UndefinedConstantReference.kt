package ast.validation

import ast.Script
import ast.expressions.*

/**
 * [SemanticError] thrown when a [Script] references an undefined constant.
 * @param identifier Identifier reference that is undefined.
 * @param source The [Expression] that contains the undefined reference.
 */
data class UndefinedConstantReference(val identifier: String, val source: Expression):
    SemanticError("Referenced undefined constant $identifier\n\tcause: $source")