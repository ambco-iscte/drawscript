package ast.instructions

import ast.expressions.Expression
import ast.expressions.Interval
import ast.expressions.VariableReference

interface ControlStructure: Instruction

data class Branch(val expr: Expression, val body: List<Instruction>, val alternative: List<Instruction> = listOf()): ControlStructure {
    override var parent: Instruction? = null
    init {
        body.forEach { it.parent = this }
        alternative.forEach { it.parent = this }
    }

    override fun toString(): String =
        "${indentation}if ($expr) \n${body.joinToString("\n")}\n$indentation" +
            (if (alternative.isEmpty()) "" else " else \n${alternative.joinToString("\n")}\n$indentation") +
            "endif"
}

data class Iteration(val interval: Interval, val iterator: VariableReference, val body: List<Instruction>): ControlStructure {
    override var parent: Instruction? = null
    init {
        body.forEach { it.parent = this }
    }

    override fun toString(): String = "${indentation}for $iterator in $interval \n${body.joinToString("\n")}\n${indentation}endfor"
}