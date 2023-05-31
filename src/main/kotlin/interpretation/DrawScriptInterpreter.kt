package interpretation

import ast.Script
import ast.expressions.*
import ast.expressions.literal.Number
import ast.expressions.literal.*
import ast.expressions.binary.*
import ast.expressions.literal.Point
import ast.instructions.*
import ast.instructions.figure.*
import ast.instructions.colour.*
import ast.instructions.control.*
import ast.instructions.figure.Rectangle
import interpretation.util.*
import parsing.ASTProjector
import java.awt.*
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener

import java.lang.RuntimeException
import javax.swing.*
import javax.swing.border.CompoundBorder
import kotlin.math.max

/**
 * Interpreter for DrawScript [Script]s.
 */
class DrawScriptInterpreter() {
    private val frame: JFrame = JFrame("DrawScript").apply {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isResizable = true
        iconImage = ImageIcon("resources/icon.png").image
        layout = GridLayout(0, 2)
        preferredSize = Dimension(720, 512)
    }

    init {
        // Build input area
        val input = JTextArea().apply {
            isEditable = true
            tabSize = 2
            border = BorderFactory.createEmptyBorder(10, 10, 10, 10)
            font = Font("Verdana", Font.PLAIN, font.size)
            val initialSize = font.size
            addMouseWheelListener(object : MouseWheelListener {
                override fun mouseWheelMoved(e: MouseWheelEvent?) {
                    if (e == null) return
                    font = Font("Verdana", Font.PLAIN, max(initialSize, font.size - e.wheelRotation))
                }
            })
        }

        // Build output area
        val right = JPanel().apply {
            layout = GridBagLayout()
            border = BorderFactory.createLineBorder(Color.BLACK, 1, false)
        }

        // Build left pane with input area and Run button
        val left = JPanel().apply {
            layout = BoxLayout(this, BoxLayout.Y_AXIS)
            border = CompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 1, false),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
            )
            add(JPanel().apply {
                layout = GridLayout(1, 1)
                maximumSize = Dimension(maximumSize.width, 30)
                add(JButton("Run").apply {
                    addActionListener {
                        try {
                            val script = ASTProjector(input.text).project()
                            val validate = script.validate()
                            if (validate.isEmpty()) {
                                right.removeAll()
                                right.add(DrawWindow(script).apply { repaint() })
                                revalidate()
                                repaint()
                            }
                            else frame.error("Interpretation Error", validate.joinToString("\n"){ it.message })
                        } catch (ex: Exception) {
                            frame.error(
                                "Parsing Exception",
                                "Parsing error: ${ex.message}\nTrace:\n    ${ex.stackTrace.take(5).joinToString("\n    ") { it.toString() }}\n    ..."
                            )
                        }
                    }
                })
            })
            add(Box.createRigidArea(Dimension(0, 5)))
            add(JScrollPane(input))
        }

        // Add left and right panes
        frame.add(left)
        frame.add(right)
    }

    /**
     * Runs the interpreter, displaying a window with the result of interpreting the [Script].
     */
    fun open() {
        frame.pack()
        frame.isVisible = true
    }

    private fun JFrame.error(title: String, message: String) =
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE)

    private inner class DrawWindow(private val script: Script): JComponent() {
        init {
            // Set window dimension
            val dim = process(script.dimension) as Point
            val width = (process(dim.x) as Number).value
            val height = (process(dim.y) as Number).value

            background = processAsColour(script.backgroundColour)
            preferredSize = Dimension(width, height)
        }

        // Program memory
        private val memory: MutableMap<String, PrimitiveType> = mutableMapOf()

        /**
         * Processes an [Expression], returning the [PrimitiveType] resulting from its evaluation.
         * @param expr The [Expression] to process.
         */
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
            else -> throw IllegalArgumentException("Invalid expression type: ${expr::class.simpleName}")
        }

        /**
         * Processes a [BinaryOperator] applied to two [Expression]s, returning the [PrimitiveType] resulting from the
         * evaluation.
         * @param left The left operand of the operator.
         * @param right The right operand of the operator.
         */
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

        /**
         * Processes an [Expression] as a colour.
         * @param expr The [Expression] to process.
         */
        private fun processAsColour(expr: Expression): Color {
            val bg = process(expr) as Colour
            val r = (process(bg.red) as Number).value
            val g = (process(bg.green) as Number).value
            val b = (process(bg.blue) as Number).value
            return Color(r, g, b)
        }

        override fun paintComponent(g: Graphics?) {
            try {
                if (g == null) return

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
                        when (val instruction = block.current()) { // Get the current instruction in the current block
                            is Branch -> { // If-Else instruction
                                block.next()
                                if (process(instruction.guard) == Bool(true)) { // If the guard is True, Then should run
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
                                    memory.remove(instruction.iterator.identifier) // On loop exit, variable no longer exists
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
                                        g.color = lineColour
                                        g.drawLine(x1, y1, x2, y2)

                                        block.next()
                                    }
                                    is Rectangle -> {
                                        val w = (process(instruction.width) as Number).value
                                        val h = (process(instruction.height) as Number).value

                                        // Draw rectangle outlines
                                        g!!.color = lineColour
                                        g.color = lineColour
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
                                        g.color = lineColour
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

                                        g.color = lineColour
                                        g.drawPolyline(xCoords.toIntArray(), yCoords.toIntArray(), xCoords.size)

                                        block.next()
                                    }
                                }
                            }
                            is SetLineColour -> {
                                lineColour = processAsColour(instruction.colour)
                                block.next()
                            }
                            is SetFillColour -> {
                                fillColour = processAsColour(instruction.colour)
                                block.next()
                            }
                            null -> break
                        }
                    }

                    // If the current sequence iterator has finished, remove it from the stack and keep going
                    if (block.finished() && !blocks.isEmpty())
                        blocks.pop()
                }
            } catch (ex: Exception) {
                frame.error("Runtime Exception", ex.message!!)
                g!!.color = frame.background
                g.fillRect(0, 0, width - 1, height - 1)
            }
        }
    }
}