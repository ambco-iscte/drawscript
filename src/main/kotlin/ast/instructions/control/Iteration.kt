package ast.instructions.control

import ast.expressions.literal.Interval
import ast.expressions.literal.VariableReference
import ast.instructions.Instruction
import ast.instructions.indentation

/**
 * Iteration [Instruction]. Iterates over every integer in [interval] with an [iterator] variable, and executes
 * the instructions in [body] for each iteration.
 * @param interval The [Interval] to iterate through.
 * @param iterator A [VariableReference] to the iterator variable.
 * @param body A list of [Instruction]s to execute on each iteration.
 */
data class Iteration(val interval: Interval, val iterator: VariableReference, val body: List<Instruction>): ControlStructure {
    override var parent: Instruction? = null
    init {
        body.forEach { it.parent = this }
    }

    override fun toString(): String = "${indentation}for $iterator in $interval {\n${body.joinToString("\n")}\n${indentation}}"
}