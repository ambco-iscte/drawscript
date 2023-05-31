package ast.instructions.control

import ast.instructions.Instruction

/**
 * [Instruction] to increment a variable.
 * @param identifier The identifier of the variable to increment.
 */
internal data class Increment(val identifier: String): Instruction {
    override var parent: Instruction? = null
}