package interpretation.util

internal class Stack<T> {

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