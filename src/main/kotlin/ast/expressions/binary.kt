package ast.expressions

data class BinaryExpression(val left: Expression, val operator: BinaryOperator, val right: Expression): Expression {

    override fun getReferencedConstantIdentifiers(): List<String> =
        left.getReferencedConstantIdentifiers() + right.getReferencedConstantIdentifiers()

    override fun toString(): String = "$left $operator $right"
}

enum class BinaryOperator(private val symbol: String, val type: BinaryOperatorType) {
    ADD("+", BinaryOperatorType.ARITHMETIC),
    SUB("-", BinaryOperatorType.ARITHMETIC),
    MUL("*", BinaryOperatorType.ARITHMETIC),
    DIV("/", BinaryOperatorType.ARITHMETIC),
    MOD("%", BinaryOperatorType.ARITHMETIC),
    POW("^", BinaryOperatorType.ARITHMETIC),
    LESS("<", BinaryOperatorType.RELATIONAL),
    GREATER(">", BinaryOperatorType.RELATIONAL),
    LEQ("<=", BinaryOperatorType.RELATIONAL),
    GEQ(">=", BinaryOperatorType.RELATIONAL),
    EQUALS("==", BinaryOperatorType.RELATIONAL),
    NEQ("!=", BinaryOperatorType.RELATIONAL);

    enum class BinaryOperatorType {
        ARITHMETIC,
        RELATIONAL
    }

    fun apply(left: Expression, right: Expression): Expression = when (type) {
        BinaryOperatorType.ARITHMETIC -> {
            TODO("Arithmetic operator application not yet implemented")
        }
        BinaryOperatorType.RELATIONAL -> {
            TODO("Relational operator application not yet implemented")
        }
    }

    override fun toString(): String = symbol
}