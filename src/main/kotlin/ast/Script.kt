package ast

import ast.instructions.Instruction



data class Script(val constants: List<NamedValue>, val properties: List<NamedValue>, val instructions: List<Instruction>) {

    fun validate(): List<SemanticError> {

    }
}