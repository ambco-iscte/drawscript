package ast.instructions.colour

import ast.instructions.Instruction
import ast.expressions.literal.Colour
import ast.expressions.Expression
import ast.instructions.indentation

/**
 * An [Instruction] to set the [Colour] used to fill figures.
 * @param colour An [Expression] representing the fill [Colour].
 */
data class SetFillColour(val colour: Expression): Instruction {
    override var parent: Instruction? = null

    override fun toString(): String = "${indentation}setfillcolor $colour"
}