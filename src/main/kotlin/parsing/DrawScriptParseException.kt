package parsing

import ast.Script

/**
 * Exception thrown when an error occurred when parsing a string to a [Script].
 * @param message The exception message.
 */
internal data class DrawScriptParseException(override val message: String): Exception(message)