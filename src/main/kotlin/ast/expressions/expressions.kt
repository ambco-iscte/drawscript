package ast.expressions

sealed interface Expression {
    fun getReferencedVariableIdentifiers(): List<String> = listOf()

    fun referencesVariables(): Boolean = getReferencedVariableIdentifiers().isNotEmpty()
}

enum class ExpressionType {
    INTEGER,
    BOOLEAN,
    COLOUR,
    POINT,
    INTERVAL,
    VARIABLE;
}