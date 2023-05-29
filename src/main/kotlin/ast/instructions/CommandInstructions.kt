package ast.instructions

import ast.expressions.Colour
import ast.expressions.Expression


data class SetLineColour(val colour: Expression): Instruction {
    override var parent: Instruction? = null

    override fun toString(): String = "${indentation}setlinecolor $colour"
}

data class SetFillColour(val colour: Expression): Instruction {
    override var parent: Instruction? = null

    override fun toString(): String = "${indentation}setfillcolor $colour"
}

data class Increment(val identifier: String): Instruction {
    override var parent: Instruction? = null
    override fun toString(): String = ""
}