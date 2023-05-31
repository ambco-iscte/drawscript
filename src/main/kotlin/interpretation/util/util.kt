package interpretation.util

import ast.instructions.Instruction

internal class LoopBody(override val instructions: List<Instruction>): InstructionBlock(instructions)

internal typealias InstructionBlockStack = Stack<InstructionBlock>

