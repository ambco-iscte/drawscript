import ast.Script
import ast.expressions.*
import ast.expressions.Number
import ast.instructions.Branch
import kotlin.test.*

import ast.instructions.SetFillColour
import ast.validation.InvalidBinaryExpressionOperatorContext
import ast.validation.InvalidColorRGBValues
import ast.validation.InvalidReferenceType

class TestAbstractSyntaxTree {

    private val simpleValid = Script(
        constants = mapOf("N" to Number(32)),
        instructions = listOf(SetFillColour(Colour(Number(128), Number(128), Number(128))))
    )

    private val invalidColour = Colour(Number(300), Number(128), Number(128))
    private val simpleInvalid = Script(
        constants = mapOf("N" to Number(32)),
        instructions = listOf(SetFillColour(invalidColour))
    )

    private val complexValid = Script(
        constants = mapOf("N" to Number(32)),
        instructions = listOf(SetFillColour(Colour(Number(0), Number(0),
            BinaryExpression(
                Number(30),
                BinaryOperator.ADD,
                BinaryExpression(ConstantReference("N"), BinaryOperator.DIV, VariableReference("i")))
        )))
    )

    private val badBinary = BinaryExpression(ConstantReference("N"), BinaryOperator.GEQ, Bool(true))
    private val complexInvalid = Script(
        constants = mapOf("N" to Number(32)),
        instructions = listOf(SetFillColour(Colour(Number(0), Number(0),
            BinaryExpression(Number(30), BinaryOperator.ADD, badBinary) // blue = 30 + (N >= true)
        )))
    )

    private val invalidIfElse = Branch(Number(30), listOf())
    private val scriptWithInvalidBranch = Script(
        constants = mapOf("N" to Number(32)),
        instructions = listOf(invalidIfElse)
    )

    @Test
    fun testValidation() {
        assertTrue(simpleValid.isValid())
        assertFalse(simpleInvalid.isValid())
        assertTrue(complexValid.isValid())
        assertFalse(complexInvalid.isValid())
        assertFalse(scriptWithInvalidBranch.isValid())
    }

    @Test
    fun testSemanticErrors() {
        assertEquals(listOf(
            InvalidColorRGBValues(300, 128, 128, invalidColour)
        ), simpleInvalid.validate())

        assertEquals(listOf(
            InvalidBinaryExpressionOperatorContext(badBinary)
        ), complexInvalid.validate())

        assertEquals(listOf(
            InvalidReferenceType(listOf(ExpressionType.BOOLEAN), ExpressionType.INTEGER, invalidIfElse.expr)
        ), scriptWithInvalidBranch.validate())
    }

    @Test
    fun testScriptPrinting() {
        assertEquals("""
            N: 32
            ---
            dimension: (100, 100)
            background: |255|255|255|
            ---
            setfillcolor |128|128|128|
        """.trimIndent(), simpleValid.toString())

        assertEquals("""
            N: 32
            ---
            dimension: (100, 100)
            background: |255|255|255|
            ---
            setfillcolor |0|0|30 + N / i|
        """.trimIndent(), complexValid.toString())
    }
}