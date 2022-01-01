package com.example.view

import tornadofx.*
import javax.script.ScriptEngineManager
import kotlin.math.pow

class CalculatorView : View("My View") {

    private var value1: String = ""
    private var value2: String = ""
    private var sign: String = ""


    override val root = vbox {
        setPrefSize(500.0, 500.0)

        // Scene //
        label("Calculator")
        hbox {
            textfield() {
                setPrefSize(200.0, 75.0)
                isDisable = true
            }
        }

        // BOX 1 //
        hbox {
            button("%") {
                setPrefSize(50.0, 50.0)

            }
            button("CE") {
                setPrefSize(50.0, 50.0)
                action {
                    value2 = ""
                }
            }
            button("C") {
                setPrefSize(50.0, 50.0)
                action {
                    value1 = ""
                    value2 = ""
                    sign = ""
                }
            }
            button("Back") {
                setPrefSize(50.0, 50.0)

            }
        }

        // BOX 2 //
        hbox {
            button("1/x") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "1/x"
                }

            }
            button("x^2") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "x^2"
                }
            }
            button("sqrt(x)") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "sqrt(x)"
                }
            }
            button("/") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "/"
                }
            }
        }

        // BOX 3 //
        hbox {
            button("7") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "7"
                        }
                        "-" -> {
                            value2 += "7"
                        }
                        "*" -> {
                            value2 += "7"
                        }
                        "/" -> {
                            value2 += "7"
                        }
                        "x^2" -> {
                            value2 += "7"
                        }
                        "sqrt(x)" -> {
                            value2 += "7"
                        }
                        "1/x" -> {
                            value2 += "7"
                        }
                        else -> {
                            value1 += "7"
                        }
                    }
                }
            }
            button("8") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "8"
                        }
                        "-" -> {
                            value2 += "8"
                        }
                        "*" -> {
                            value2 += "8"
                        }
                        "/" -> {
                            value2 += "8"
                        }
                        "x^2" -> {
                            value2 += "8"
                        }
                        "sqrt(x)" -> {
                            value2 += "8"
                        }
                        "1/x" -> {
                            value2 += "8"
                        }
                        else -> {
                            value1 += "8"
                        }
                    }
                }
            }
            button("9") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "9"
                        }
                        "-" -> {
                            value2 += "9"
                        }
                        "*" -> {
                            value2 += "9"
                        }
                        "/" -> {
                            value2 += "9"
                        }
                        "x^2" -> {
                            value2 += "9"
                        }
                        "sqrt(x)" -> {
                            value2 += "9"
                        }
                        "1/x" -> {
                            value2 += "9"
                        }
                        else -> {
                            value1 += "9"
                        }
                    }
                }
            }
            button("*") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "*"
                }
            }
        }

        // BOX 4 //
        hbox {
            button("4") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "4"
                        }
                        "-" -> {
                            value2 += "4"
                        }
                        "*" -> {
                            value2 += "4"
                        }
                        "/" -> {
                            value2 += "4"
                        }
                        "x^2" -> {
                            value2 += "4"
                        }
                        "sqrt(x)" -> {
                            value2 += "4"
                        }
                        "1/x" -> {
                            value2 += "4"
                        }
                        else -> {
                            value1 += "4"
                        }
                    }
                }
            }
            button("5") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "5"
                        }
                        "-" -> {
                            value2 += "5"
                        }
                        "*" -> {
                            value2 += "5"
                        }
                        "/" -> {
                            value2 += "5"
                        }
                        "x^2" -> {
                            value2 += "5"
                        }
                        "sqrt(x)" -> {
                            value2 += "5"
                        }
                        "1/x" -> {
                            value2 += "5"
                        }
                        else -> {
                            value1 += "5"
                        }
                    }
                }
            }
            button("6") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "6"
                        }
                        "-" -> {
                            value2 += "6"
                        }
                        "*" -> {
                            value2 += "6"
                        }
                        "/" -> {
                            value2 += "6"
                        }
                        "x^2" -> {
                            value2 += "6"
                        }
                        "sqrt(x)" -> {
                            value2 += "6"
                        }
                        "1/x" -> {
                            value2 += "6"
                        }
                        else -> {
                            value1 += "6"
                        }
                    }
                }
            }
            button("-") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "-"
                }
            }
        }

        // BOX 5 //
        hbox {
            button("1") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "1"
                        }
                        "-" -> {
                            value2 += "1"
                        }
                        "*" -> {
                            value2 += "1"
                        }
                        "/" -> {
                            value2 += "1"
                        }
                        "x^2" -> {
                            value2 += "1"
                        }
                        "sqrt(x)" -> {
                            value2 += "1"
                        }
                        "1/x" -> {
                            value2 += "1"
                        }
                        else -> {
                            value1 += "1"
                        }
                    }
                }
            }
            button("2") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "2"
                        }
                        "-" -> {
                            value2 += "2"
                        }
                        "*" -> {
                            value2 += "2"
                        }
                        "/" -> {
                            value2 += "2"
                        }
                        "x^2" -> {
                            value2 += "2"
                        }
                        "sqrt(x)" -> {
                            value2 += "2"
                        }
                        "1/x" -> {
                            value2 += "2"
                        }
                        else -> {
                            value1 += "2"
                        }
                    }
                }
            }
            button("3") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "3"
                        }
                        "-" -> {
                            value2 += "3"
                        }
                        "*" -> {
                            value2 += "3"
                        }
                        "/" -> {
                            value2 += "3"
                        }
                        "x^2" -> {
                            value2 += "3"
                        }
                        "sqrt(x)" -> {
                            value2 += "3"
                        }
                        "1/x" -> {
                            value2 += "3"
                        }
                        else -> {
                            value1 += "3"
                        }
                    }
                }
            }
            button("+") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "+"
                }
            }
        }

        // BOX 6 //
        hbox {
            button("+/-") {
                setPrefSize(50.0, 50.0)

            }
            button("0") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            value2 += "0"
                        }
                        "-" -> {
                            value2 += "0"
                        }
                        "*" -> {
                            value2 += "0"
                        }
                        "/" -> {
                            value2 += "0"
                        }
                        "x^2" -> {
                            value2 += "0"
                        }
                        "sqrt(x)" -> {
                            value2 += "0"
                        }
                        "1/x" -> {
                            value2 += "0"
                        }
                        else -> {
                            value1 += "0"
                        }
                    }
                }
            }
            button(",") {
                setPrefSize(50.0, 50.0)

            }
            button("=") {
                setPrefSize(50.0, 50.0)
                action {
                    when (sign) {
                        "+" -> {
                            println("$value1+$value2=")
                            var value3 = sum(value1.toDouble(), value2.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }

                        "-" -> {
                            println("$value1-$value2=")
                            var value3 = subtract(value1.toDouble(), value2.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                        "*" -> {
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("500*(3+2)"))
                            println("$value1*$value2=")
                            var value3 = multiply(value1.toDouble(), value2.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                        "/" -> {
                            println("$value1/$value2=")
                            var value3 = divide(value1.toDouble(), value2.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                        "x^2" -> {
                            println("$value1^2=")
                            var value3 = square(value1.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                        "sqrt(x)" -> {
                            println("sqrt($value1)=")
                            var value3 = radical(value1.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                        "1/x" -> {
                            println("1/$value1=")
                            var value3 = reverse(value1.toDouble())
                            println(value3)
                            sign = ""
                            value1 = ""
                            value2 = ""
                        }
                    }
                }
            }
        }

    }

    // Operator!!! //

    // "+"
    private fun sum(value1: Double, value2: Double): Double {
        return value1 + value2
    }

    // "-"
    private fun subtract(value1: Double, value2: Double): Double {
        return value1 - value2
    }

    // "*"
    private fun multiply(value1: Double, value2: Double): Double {
        return value1 * value2
    }

    // "/"
    private fun divide(value1: Double, value2: Double): Double {
        return value1 / value2
    }

    // "x^2"
    private fun square(value: Double): Double {
        return value * value
    }

    // "sqrt(x)"
    private fun radical(value: Double): Double {
        return value.pow(0.5)
    }

    // "1/x"
    private fun reverse(value: Double): Double {
        return 1 / value
    }

}
