package ast.expressions

import kotlin.math.pow
import kotlin.math.roundToInt

data class BinaryExpression(val left: Expression, val operator: BinaryOperator, val right: Expression): Expression {
    override fun getReferencedVariableIdentifiers(): List<String> =
        left.getReferencedVariableIdentifiers() + right.getReferencedVariableIdentifiers()

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

    val isArithmetic: Boolean = type == BinaryOperatorType.ARITHMETIC

    val isRelational: Boolean = type == BinaryOperatorType.RELATIONAL

    fun apply(left: Expression, right: Expression): Expression = when (type) {
        BinaryOperatorType.ARITHMETIC ->
            if (left.referencesVariables() || right.referencesVariables()) BinaryExpression(left, this, right)
            else if (left is Number && right is Number) Number(arithmetic(left.value, right.value))
            else throw UnsupportedOperationException("Arithmetic operators can only be used on integers or variables!")
        BinaryOperatorType.RELATIONAL ->
            if (left.referencesVariables() || right.referencesVariables()) BinaryExpression(left, this, right)
            else if (left is Number && right is Number) Bool(relational(left.value, right.value))
            else if (this == EQUALS) Bool(left == right)
            else if (this == NEQ) Bool(left != right)
            else throw UnsupportedOperationException("Non-number expressions can only be compared for equality!")
    }

    private fun arithmetic(first: Int, second: Int): Int = when (this) {
        ADD -> first + second
        SUB -> first - second
        MUL -> first * second
        DIV -> first / second
        MOD -> first % second
        POW -> first.toDouble().pow(second).roundToInt()
        else -> throw UnsupportedOperationException("Unsupported operator for arithmetic operation: $this")
    }

    private fun relational(first: Int, second: Int): Boolean = when (this) {
        LESS -> first < second
        GREATER -> first > second
        LEQ -> first <= second
        GEQ -> first >= second
        EQUALS -> first == second
        NEQ -> first != second
        else -> throw UnsupportedOperationException("Unsupported operator for relational operation: $this")
    }

    override fun toString(): String = symbol
}