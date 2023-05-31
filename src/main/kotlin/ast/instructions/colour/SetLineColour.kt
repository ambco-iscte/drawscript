package ast.instructions.colour

import ast.instructions.Instruction
import ast.expressions.literal.Colour
import ast.expressions.Expression
import ast.instructions.indentation

/**
 * [Instruction] to set the [Colour] used to draw lines and figure outlines.
 * @param colour An [Expression] representing the line [Colour].
 */
data class SetLineColour(val colour: Expression): Instruction {
    override var parent: Instruction? = null

    override fun toString(): String = "${indentation}setlinecolor $colour"
}