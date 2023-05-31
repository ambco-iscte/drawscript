package ast.expressions

import ast.Script

/**
 * Generic [Script] expression.
 */
interface Expression {

    /**
     * Returns a list of strings of the identifiers of all the variables that this expression references.
     */
    fun getReferencedVariableIdentifiers(): List<String> = listOf()

    /**
     * Does this expression reference any variables?
     */
    fun referencesVariables(): Boolean = getReferencedVariableIdentifiers().isNotEmpty()

    /**
     * Expression types: Integer, Boolean, Colour, Point, Interval, and Variable.
     */
    enum class ExpressionType {
        INTEGER,
        BOOLEAN,
        COLOUR,
        POINT,
        INTERVAL,
        VARIABLE;
    }
}