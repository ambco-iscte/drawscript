package interpretation

import ast.instructions.Instruction

open class InstructionBlock(open val instructions: List<Instruction>): Iterator<Instruction> {
    private var i: Int = 0

    fun current(): Instruction? = if (i >= instructions.size) null else instructions[i]

    fun finished(): Boolean = !hasNext()

    override fun hasNext(): Boolean = i < instructions.size

    override fun next(): Instruction = instructions[i++]

    override fun toString(): String = "{${instructions.joinToString("; ").replace("\t", "")}}"
}

class LoopBody(override val instructions: List<Instruction>): InstructionBlock(instructions)

typealias InstructionBlockStack = Stack<InstructionBlock>

class Stack<T> {

    private val elements: MutableList<T> = mutableListOf()

    fun size(): Int = elements.size

    fun isEmpty(): Boolean = elements.isEmpty()

    fun push(element: T) = elements.add(element)

    fun pop(): T = if (isEmpty()) throw NoSuchElementException("Stack underflow!") else elements.removeLast()

    // Pop elements from the list while the predicate is true
    fun popUntil(predicate: (T) -> Boolean): List<T> {
        val popped = mutableListOf<T>()
        while (!isEmpty() && predicate(top()!!)) popped.add(pop())
        return popped
    }

    fun top(): T? = if (isEmpty()) null else elements.last()
}