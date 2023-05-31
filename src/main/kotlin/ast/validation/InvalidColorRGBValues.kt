package ast.validation

import ast.expressions.*
import ast.expressions.literal.Colour

/**
 * [SemanticError] thrown when a [Colour]'s RGB values are invalid.
 * @param r The colour's RED value.
 * @param g The colour's GREEN value.
 * @param b The colour's BLUE value.
 * @param source The [Expression] that contains the invalid colours.
 */
data class InvalidColorRGBValues(val r: Int, val g: Int, val b: Int, val source: Expression):
    SemanticError("Invalid colour: ($r, $g, $b). RGB values must be between 0 and 255 (both inclusive).\n\tcause: $source")