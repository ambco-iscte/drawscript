package ast.expressions.binary

import ast.expressions.Expression
import kotlin.math.pow
import kotlin.math.roundToInt
import ast.expressions.literal.Number
import ast.expressions.literal.Bool

/**
 * Binary operator.
 * @param symbol The text symbol of the operator, e.g. "+", "/", etc.
 * @param type The type of the operator, i.e. Arithmetic or Relational.
 */
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

    /**
     * Binary operator types, i.e. Arithmetic or Relational.
     */
    enum class BinaryOperatorType {
        ARITHMETIC,
        RELATIONAL
    }

    /**
     * Is the operator arithmetic?
     */
    val isArithmetic: Boolean = type == BinaryOperatorType.ARITHMETIC

    /**
     * Is the operator relational?
     */
    val isRelational: Boolean = type == BinaryOperatorType.RELATIONAL

    companion object {
        /**
         * Parses a symbol string to its corresponding [BinaryOperator].
         */
        fun parse(symbol: String): BinaryOperator = values().first { it.symbol == symbol }
    }

    /**
     * Applies the current operator to two [Expression]s **semantically**, i.e. ignoring runtime-specific
     * values such as variable references.
     * @param left The left [Expression] operand.
     * @param right The right [Expression] operand.
     */
    fun applySemantically(left: Expression, right: Expression): Expression = when (type) {
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

    /**
     * Applies the current operator as an arithmetic operator to two integers.
     */
    internal fun arithmetic(first: Int, second: Int): Int = when (this) {
        ADD -> first + second
        SUB -> first - second
        MUL -> first * second
        DIV -> first / second
        MOD -> first % second
        POW -> first.toDouble().pow(second).roundToInt()
        else -> throw UnsupportedOperationException("Unsupported operator for arithmetic operation: $this")
    }

    /**
     * Applies the current operator as a relational operator to two integers.
     */
    internal fun relational(first: Int, second: Int): Boolean = when (this) {
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