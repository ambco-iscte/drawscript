package ast.expressions.literal

import ast.expressions.Expression

/**
 * [Expression] to represent a 2D point with coordinates [x] and [y].
 * @param x An [Expression] representing the X coordinate of the point.
 * @param y An [Expression] representing the Y coordinate of the point.
 */
data class Point(val x: Expression, val y: Expression): PrimitiveType {
    override fun getReferencedVariableIdentifiers(): List<String> =
        x.getReferencedVariableIdentifiers() + y.getReferencedVariableIdentifiers()

    override fun toString(): String = "($x, $y)"
}