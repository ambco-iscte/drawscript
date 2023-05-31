package ast.instructions.control

import ast.expressions.Expression
import ast.instructions.Instruction
import ast.instructions.indentation

/**
 * Conditional branch [Instruction]. Executes the [Instruction]s in [body] if the [guard] evaluates to True;
 * otherwise, executes the instructions in [alternative].
 * @param guard
 * @param body
 * @param alternative
 */
data class Branch(val guard: Expression, val body: List<Instruction>, val alternative: List<Instruction> = listOf()): ControlStructure {
    override var parent: Instruction? = null
    init {
        body.forEach { it.parent = this }
        alternative.forEach { it.parent = this }
    }

    override fun toString(): String =
        "${indentation}if ($guard) \n${body.joinToString("\n")}\n$indentation" +
                (if (alternative.isEmpty()) "" else " else \n${alternative.joinToString("\n")}\n$indentation") +
                "endif"
}