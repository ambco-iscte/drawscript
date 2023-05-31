package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] to represent a colour with [red], [green], and [blue] values.
 * @param red An [Expression] representing the RED component of the colour.
 * @param green An [Expression] representing the GREEN component of the colour.
 * @param blue An [Expression] representing the BLUE component of the colour.
 */
data class Colour(val red: Expression, val green: Expression, val blue: Expression): PrimitiveType {
    override fun getReferencedVariableIdentifiers(): List<String> =
        red.getReferencedVariableIdentifiers() + green.getReferencedVariableIdentifiers() + blue.getReferencedVariableIdentifiers()

    override fun toString(): String = "|$red|$green|$blue|"
}