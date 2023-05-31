package ast.instructions

import ast.Script
import ast.instructions.control.ControlStructure

/**
 * Generic [Script] instruction.
 */
interface Instruction {
    var parent: Instruction?
}

internal val Instruction.depth: Int
    get() = if (parent == null) 0 else (if (parent is ControlStructure) 0 else 1) + parent!!.depth

internal val Instruction.indentation: String
    get() = "\t".repeat(depth)