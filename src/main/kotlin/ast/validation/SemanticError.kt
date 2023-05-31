package ast.validation

/**
 * General [ast.Script] semantic error.
 * @param message Error message.
 */
sealed class SemanticError(val message: String) {
    override fun toString(): String = message
}