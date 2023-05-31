package ast.instructions.figure

import ast.instructions.Instruction
import ast.expressions.literal.Point

/**
 * Generic figure instruction. Defines the top-left [Point] as the [start] of the figure.
 * @param start Top-left [Point] of the figure to be drawn.
 */
open class FigureInstruction(open val start: Point): Instruction {
    override var parent: Instruction? = null
}