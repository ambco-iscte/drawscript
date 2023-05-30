package interpretation

import ast.Script
import ast.expressions.*
import java.lang.RuntimeException
import ast.expressions.Number
import ast.instructions.*
import parsing.ASTProjector
import java.awt.Color
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.Graphics
import javax.swing.ImageIcon
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.WindowConstants

fun main() {
    DrawScriptInterpreter.read("example.txt").run()
}

class DrawScriptInterpreter(private val script: Script) {
    init {
        if (!script.isValid())
            throw IllegalArgumentException(
                "Cannot interpret semantically-incorrect script:\n${script.validate().joinToString("\n") { 
                    it.message 
                }}"
            )
    }

    companion object {
        fun read(file: String): DrawScriptInterpreter = DrawScriptInterpreter(ASTProjector(file).project())
    }

    // Program memory
    private val memory: MutableMap<String, PrimitiveType> = mutableMapOf()

    private fun process(expr: Expression): PrimitiveType = when (expr) {
        is Bool, is Number -> expr as PrimitiveType
        is ConstantReference -> process(script.constants[expr.identifier]!!)
        is Colour -> Colour(process(expr.red), process(expr.green), process(expr.blue))
        is Point -> Point(process(expr.x), process(expr.y))
        is Interval -> Interval(process(expr.start), process(expr.end), expr.type)
        is BinaryExpression -> expr.operator.process(process(expr.left), process(expr.right))
        is VariableReference ->
            if (memory.containsKey(expr.identifier)) process(memory[expr.identifier]!!)
            else throw RuntimeException("Undefined variable reference: ${expr.identifier}")
    }

    private fun BinaryOperator.process(left: Expression, right: Expression): PrimitiveType = when (type) {
        BinaryOperator.BinaryOperatorType.ARITHMETIC -> {
            val l = process(left)
            val r = process(right)
            if (l is Number && r is Number) Number(arithmetic(l.value, r.value))
            else throw UnsupportedOperationException("Arithmetic operators can only be used on integers or variables!")
        }
        BinaryOperator.BinaryOperatorType.RELATIONAL -> {
            val l = process(left)
            val r = process(right)
            if (l is Number && r is Number) Bool(relational(l.value, r.value))
            else if (this == BinaryOperator.EQUALS) Bool(l == r)
            else if (this == BinaryOperator.NEQ) Bool(l != r)
            else throw UnsupportedOperationException("Non-number expressions can only be compared for equality!")
        }
    }
    fun run() {
        // Initialize Swing frame
        val frame: JFrame = JFrame("DrawScript").apply {
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            isResizable = false
            iconImage = ImageIcon("resources/icon.png").image
        }

        // Set window dimension
        val dim = process(script.dimension) as Point
        val width = (process(dim.x) as Number).value
        val height = (process(dim.y) as Number).value

        // Set window background colour
        val bg = process(script.backgroundColour) as Colour
        val r = (process(bg.red) as Number).value
        val g = (process(bg.green) as Number).value
        val b = (process(bg.blue) as Number).value
        frame.background = Color(r, g, b)

        val window = DrawWindow()
        window.preferredSize = Dimension(width, height)
        window.layout = FlowLayout()
        frame.add(window)
        window.repaint()

        frame.pack()
        frame.isVisible = true
    }

    private inner class DrawWindow: JComponent() {
        override fun paintComponent(g: Graphics?) {
            // Clear memory
            memory.clear()

            var lineColour: Color = Color.BLACK
            var fillColour: Color = Color.BLACK

            // Initialise sequence stack with the top-level program instructions
            val blocks = InstructionBlockStack()
            blocks.push(InstructionBlock(script.instructions))

            // Evaluate instruction sequences
            while (!blocks.isEmpty()) {
                val block = blocks.top() // Get the current sequence
                while (block!!.hasNext()) { // If the sequence iterator has not yet finished
                    val instruction = block.current()
                    //println("Executing instruction: $instruction")
                    when (instruction) { // Get the current instruction in the current block
                        is Branch -> { // If-Else instruction
                            block.next()
                            if (process(instruction.expr) == Bool(true)) { // If the guard is True, Then should run
                                if (instruction.body.isNotEmpty()) { // And the body contains instructions
                                    blocks.push(InstructionBlock(instruction.body)) // Push the Then body if not empty
                                    break // Go back to the top of the stack
                                }
                            } else if (instruction.alternative.isNotEmpty()) { // Otherwise, Else should run
                                blocks.push(InstructionBlock(instruction.alternative)) // Push the Else body if not empty
                                break // Go back to the top of the stack
                            }
                        }
                        is Iteration -> { // Loop instruction
                            val interval = instruction.interval
                            val start = process(interval.start) as Number
                            val end = process(interval.end) as Number

                            // Account for interval type
                            val s =
                                if (interval.type == Interval.IntervalType.OPEN || interval.type == Interval.IntervalType.LEFT_OPEN)
                                    start.value + 1
                                else start.value
                            val e =
                                if (interval.type == Interval.IntervalType.OPEN || interval.type == Interval.IntervalType.RIGHT_OPEN)
                                    end.value - 1
                                else end.value

                            // Initialise iterator variable if necessary
                            if (!memory.containsKey(instruction.iterator.identifier))
                                memory[instruction.iterator.identifier] = Number(s)

                            val it = process(instruction.iterator) as Number
                            if (it.value in s..e) {
                                val increment: Instruction = Increment(instruction.iterator.identifier)
                                blocks.push(LoopBody(instruction.body + listOf(increment)))
                                break // Go back to the top of the stack
                            } else {
                                memory[instruction.iterator.identifier] = Number(s)
                                block.next() // Otherwise, the loop is done and we can move on
                            }
                        }
                        is Increment -> {
                            memory[instruction.identifier] =
                                Number((memory[instruction.identifier] as Number).value + 1)
                            block.next()
                        }
                        is FigureInstruction -> {
                            val start = instruction.start
                            val x1 = (process(start.x) as Number).value
                            val y1 = (process(start.y) as Number).value

                            when (instruction) {
                                is Line -> {
                                    // Process points to obtain pixel coordinates
                                    val end = instruction.end
                                    val x2 = (process(end.x) as Number).value
                                    val y2 = (process(end.y) as Number).value

                                    // Draw line
                                    g!!.color = lineColour
                                    g.drawLine(x1, y1, x2, y2)

                                    block.next()
                                }
                                is Rectangle -> {
                                    val w = (process(instruction.width) as Number).value
                                    val h = (process(instruction.height) as Number).value

                                    //println("Drawing ${w}x$h rectangle at top left ($x1,$y1)")

                                    // Draw rectangle outlines
                                    g!!.color = lineColour
                                    g.drawRect(x1, y1, w, h)

                                    // Draw rectangle fill
                                    g.color = fillColour
                                    g.fillRect(x1 + 1, y1 + 1, w - 1, h - 1)

                                    block.next()
                                }
                                is Ellipse -> {
                                    val cx = (process(instruction.center.x) as Number).value
                                    val cy = (process(instruction.center.y) as Number).value

                                    val w = (process(instruction.width) as Number).value
                                    val h = (process(instruction.height) as Number).value

                                    val topLeftX = cx - w / 2
                                    val topLeftY = cy - h / 2

                                    // Draw rectangle outlines
                                    g!!.color = lineColour
                                    g.drawOval(topLeftX, topLeftY, w, h)

                                    // Draw rectangle fill
                                    g.color = fillColour
                                    g.fillOval(topLeftX + 1, topLeftY + 1, w - 1, h - 1)

                                    block.next()
                                }
                                is Polyline -> {
                                    val xCoords = mutableListOf(x1)
                                    val yCoords = mutableListOf(y1)

                                    // Process all points and add to list
                                    instruction.points.forEach {
                                        xCoords.add((process(it.x) as Number).value)
                                        yCoords.add((process(it.y) as Number).value)
                                    }

                                    g!!.color = lineColour
                                    g.drawPolyline(xCoords.toIntArray(), yCoords.toIntArray(), xCoords.size)

                                    block.next()
                                }
                            }
                        }
                        is SetLineColour -> {
                            val colour = process(instruction.colour) as Colour
                            val red = (process(colour.red) as Number).value
                            val green = (process(colour.green) as Number).value
                            val blue = (process(colour.blue) as Number).value
                            lineColour = Color(red, green, blue)
                            block.next()
                        }
                        is SetFillColour -> {
                            val colour = process(instruction.colour) as Colour
                            val red = (process(colour.red) as Number).value
                            val green = (process(colour.green) as Number).value
                            val blue = (process(colour.blue) as Number).value
                            fillColour = Color(red, green, blue)
                            block.next()
                        }
                        null -> break
                    }
                }

                // If the current sequence iterator has finished, remove it from the stack and keep going
                if (block.finished() && !blocks.isEmpty())
                    blocks.pop()
            }
        }
    }
}