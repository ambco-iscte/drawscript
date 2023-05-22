package ast.expressions

sealed interface Expression {
    fun getReferencedConstantIdentifiers(): List<String> = listOf()
}