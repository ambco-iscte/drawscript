package ast

import ast.expressions.*
import ast.expressions.Number
import ast.instructions.*
import ast.validation.*

/**
 * Abstract DrawScript script.
 * @param constants Constants defined within the scope of the script.
 * @param dimension Display window dimension. Default: (100, 100).
 * @param backgroundColour Display window background color. Default: |255|255|255| (White).
 * @param instructions List of script [Instruction]s.
 */
data class Script(
    val constants: Map<String, Expression>,
    val dimension: Expression = Point(Number(100), Number(100)),
    val backgroundColour: Expression = Colour(Number(255), Number(255), Number(255)),
    val instructions: List<Instruction>
) {

    private fun Expression.isIntegerOrReferencesVariables(): Boolean =
        this.getType() == ExpressionType.INTEGER || this.referencesVariables()

    /**
     * Validates the script, outputting a list of [SemanticError]s.
     */
    fun validate(): List<SemanticError> {
        val errors = mutableListOf<SemanticError>()
        instructions.forEach { errors.addAll(validate(it)) }

        // Validate dimension
        // TODO: test
        val dim = simplifySemantically(dimension)
        if (dim.getType() != ExpressionType.POINT)
            errors.add(InvalidReferenceType(listOf(ExpressionType.POINT), dim.getType(), dimension))

        // Validate background colour
        // TODO: test
        val bg = simplifySemantically(backgroundColour)
        if (bg.getType() != ExpressionType.COLOUR)
            errors.add(InvalidReferenceType(listOf(ExpressionType.COLOUR), bg.getType(), backgroundColour))

        return errors
    }

    /**
     * Is the script valid? That is, are there no [SemanticError]s in it?
     * @see [validate]
     */
    fun isValid(): Boolean = validate().isEmpty()

    /**
     * Computes the [ExpressionType] of the expression.
     */
    private fun Expression.getType(): ExpressionType {
        require(validate(this).isEmpty()) { "Cannot solve non-validated expression!" }
        return when (this) {
            is Number -> ExpressionType.INTEGER
            is Bool -> ExpressionType.BOOLEAN
            is VariableReference -> ExpressionType.VARIABLE
            is ConstantReference -> constants[identifier]!!.getType()
            is Colour -> ExpressionType.COLOUR
            is Point -> ExpressionType.POINT
            is Interval -> ExpressionType.INTERVAL
            is BinaryExpression -> if (operator.isArithmetic) ExpressionType.INTEGER else ExpressionType.BOOLEAN
        }
    }

    /**
     * Simplifies a DrawScript [Expression].
     * Example: simplify("3 + 5") = "8"
     * @param expr The expression to simplify.
     */
    private fun simplifySemantically(expr: Expression): Expression {
        require(validate(expr).isEmpty()) { "Cannot solve non-validated expression!" }
        return when (expr) {
            is ConstantReference -> simplifySemantically(constants[expr.identifier]!!)
            is Colour -> Colour(simplifySemantically(expr.red), simplifySemantically(expr.green), simplifySemantically(expr.blue))
            is Point -> Point(simplifySemantically(expr.x), simplifySemantically(expr.y))
            is Interval -> Interval(simplifySemantically(expr.start), simplifySemantically(expr.end), expr.type)
            is BinaryExpression -> expr.operator.applySemantically(simplifySemantically(expr.left), simplifySemantically(expr.right))
            else -> expr
        }
    }

    /**
     * Validates a DrawScript [Instruction], outputting a list of [SemanticError]s.
     * @param instruction The [Instruction] to validate.
     */
    private fun validate(instruction: Instruction): List<SemanticError> = when (instruction) {
        is SetLineColour -> validate(instruction.colour)
        is SetFillColour -> validate(instruction.colour)
        is Branch -> {
            val errors = mutableListOf<SemanticError>()
            errors.addAll(validate(instruction.expr))
            if (instruction.expr.getType() != ExpressionType.BOOLEAN)
                errors.add(InvalidReferenceType(listOf(ExpressionType.BOOLEAN), instruction.expr.getType(), instruction.expr))
            instruction.body.forEach { errors.addAll(validate(it)) }
            instruction.alternative.forEach { errors.addAll(validate(it)) }
            errors
        }
        is Iteration -> {
            val errors = mutableListOf<SemanticError>()
            instruction.body.forEach { errors.addAll(validate(it)) }
            errors
        }
        else -> listOf()
    }

    /**
     * Validates a DrawScript [Expression], outputting a list of [SemanticError]s.
     */
    private fun validate(expr: Expression): List<SemanticError> = when (expr) {
        is ConstantReference ->
            if (constants.containsKey(expr.identifier)) validate(constants[expr.identifier]!!)
            else listOf(UndefinedConstantReference(expr.identifier, expr)) // TODO: test
        is Colour -> validateColour(expr)
        is Point -> validateAllIntegers(expr.x, expr.y)
        is Interval -> {
            val errors = mutableListOf<SemanticError>()
            errors.addAll(validateAllIntegers(expr.start, expr.end))
            if (errors.isEmpty() && (simplifySemantically(expr.start) as Number).value > (simplifySemantically(expr.end) as Number).value)
                errors.add(InvalidIntervalDefinition(expr)) // TODO: test
            errors
        }
        is BinaryExpression -> validateBinaryExpression(expr)
        else -> listOf() // "Primitive" types will never have semantic errors
    }

    /**
     * Validates a [Colour] expression, asserting that all parameters evaluate to [Number]s between 0 and 255.
     * @param colour The [Colour] to evaluate.
     */
    private fun validateColour(colour: Colour): List<SemanticError> {
        val errors = mutableListOf<SemanticError>()

        // Validate underlying expressions
        errors.addAll(validate(colour.red))
        errors.addAll(validate(colour.green))
        errors.addAll(validate(colour.blue))

        if (errors.isEmpty()) {
            // Check if colour is defined with non-integer parameter expressions
            listOf(colour.red.getType(), colour.green.getType(), colour.blue.getType()).forEach {
                if (it != ExpressionType.INTEGER)
                    errors.add(InvalidReferenceType(listOf(ExpressionType.INTEGER), it, colour))
            }

            if (!colour.red.referencesVariables() && !colour.green.referencesVariables() && !colour.blue.referencesVariables()) {
                // Check that the RGB values are all in [0, 255]
                val r = simplifySemantically(colour.red) as Number // Can cast to Number because we asserted getType() == INTEGER
                val g = simplifySemantically(colour.green) as Number
                val b = simplifySemantically(colour.blue) as Number
                if (r.value !in 0..255 || g.value !in 0..255 || b.value !in 0..255)
                    errors.add(InvalidColorRGBValues(r.value, g.value, b.value, colour))
            }
        }

        return errors
    }

    /**
     * Validates that all [Expression]s in a collection are of type [ExpressionType.INTEGER].
     * @param expressions A collection of [Expression]s to validate.
     */
    private fun validateAllIntegers(vararg expressions: Expression): List<SemanticError> {
        val errors = mutableListOf<SemanticError>()
        expressions.forEach { errors.addAll(validate(it)) }
        if (errors.isEmpty()) {
            expressions.forEach {
                if (it.getType() != ExpressionType.INTEGER)
                    errors.add(InvalidReferenceType(listOf(ExpressionType.INTEGER), it.getType(), it))
            }
        }
        return errors
    }

    /**
     * Validates a [BinaryExpression], ensuring type and relation validity.
     * @param expr The [BinaryExpression] to validate.
     */
    private fun validateBinaryExpression(expr: BinaryExpression): List<SemanticError> {
        val errors = mutableListOf<SemanticError>()

        errors.addAll(validate(expr.left))
        errors.addAll(validate(expr.right))

        if (errors.isEmpty()) {
            if (expr.operator.isArithmetic) {
                if (!expr.left.isIntegerOrReferencesVariables())
                    errors.add(InvalidReferenceType(listOf(ExpressionType.INTEGER, ExpressionType.VARIABLE), expr.left.getType(), expr))
                if (!expr.right.isIntegerOrReferencesVariables())
                    errors.add(InvalidReferenceType(listOf(ExpressionType.INTEGER, ExpressionType.VARIABLE), expr.right.getType(), expr))
            }
            else {
                /*
                 * == and != allow everything
                 * Remaining operators only work if:
                 *  - Both are numbers; OR
                 *  - At least one of them references variables
                 *
                 * X := left !is Number
                 * Y := left !referencesVariable
                 * Z := right !is Number
                 * W := right !referencesVariable
                 *
                 * Hence, remaining operators throw an error if:
                 * !((!X && !Z) || (!Y || !W))
                 *  = !(!X && !Z) && !(!Y || !W)
                 *  = (X || Z) && (Y && W)
                 */
                val oneNotNumber = expr.left.getType() != ExpressionType.INTEGER || expr.right.getType() != ExpressionType.INTEGER
                val noVarRefs = !expr.left.referencesVariables() && !expr.right.referencesVariables()
                if (expr.operator != BinaryOperator.EQUALS && expr.operator != BinaryOperator.NEQ && oneNotNumber && noVarRefs)
                    errors.add(InvalidBinaryExpressionOperatorContext(expr))
            }
        }

        return errors
    }

    override fun toString(): String =
        constants.keys.joinToString("\n") { id -> "$id: ${constants[id]}" } +
                "\n---\n" +
                "dimension: $dimension\nbackground: $backgroundColour" +
                "\n---\n" +
                instructions.joinToString("\n")
}