package interpretation.util

import ast.instructions.Instruction

internal open class InstructionBlock(open val instructions: List<Instruction>): Iterator<Instruction> {
    private var i: Int = 0

    fun current(): Instruction? = if (i >= instructions.size) null else instructions[i]

    fun finished(): Boolean = !hasNext()

    override fun hasNext(): Boolean = i < instructions.size

    override fun next(): Instruction = instructions[i++]

    override fun toString(): String = "{${instructions.joinToString("; ").replace("\t", "")}}"
}