package com.example.view

import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javax.script.ScriptEngineManager

class CalculatorView : View("My View") {

    private var textFieldStringProperty = SimpleStringProperty()
    private var value1: String = ""
    private var value2: String = ""
    private var sign: String = ""


    override val root = vbox {
        setPrefSize(500.0, 500.0)

        // Scene //
        label("Calculator")
        hbox {
            textfield {
                setPrefSize(200.0, 75.0)
                isDisable = true
            }.bind(textFieldStringProperty)
        }

        // BOX 1 //
        hbox {
            button("%") {
                setPrefSize(50.0, 50.0)
                action {
                    sign = "%"
                }
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
                action {
                    isDisable = true
                }
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
                    activeVariant("7")
                }
            }
            button("8") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("8")
                }
            }
            button("9") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("9")
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
                    activeVariant("4")
                }
            }
            button("5") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("5")
                }
            }
            button("6") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("6")
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
                    activeVariant("1")
                }
            }
            button("2") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("2")
                }
            }
            button("3") {
                setPrefSize(50.0, 50.0)
                action {
                    activeVariant("3")
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
                    activeVariant("0")
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
                            print("$value1+$value2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2")
                                    .toString()
                        }
                        "-" -> {
                            print("$value1-$value2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2")
                                    .toString()
                        }
                        "*" -> {
                            print("$value1*$value2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2")
                                    .toString()
                        }
                        "/" -> {
                            print("$value1/$value2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 $sign $value2")
                                    .toString()
                        }
                        "x^2" -> {
                            print("$value1^2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 * $value1"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 * $value1")
                                    .toString()
                        }
                        "sqrt(x)" -> {
                            print("sqrt($value1)=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("Math.sqrt($value1)"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("Math.sqrt($value1)")
                                    .toString()
                        }
                        "1/x" -> {
                            print("1/$value1=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("1 / $value1"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("1 / $value1")
                                    .toString()
                        }
                        "%" -> {
                            print("$value1%$value2=")
                            println(ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 / $value2 * 100"))
                            textFieldStringProperty.value =
                                ScriptEngineManager().getEngineByName("JavaScript").eval("$value1 / $value2 * 100")
                                    .toString()
                        }
                    }
                    sign = ""
                    value1 = ""
                    value2 = ""
                }
            }
        }
    }

    // Active course of action //

    private fun activeVariant(variant: String) {
        when (sign) {
            "+" -> {
                value2 += variant
            }
            "-" -> {
                value2 += variant
            }
            "*" -> {
                value2 += variant
            }
            "/" -> {
                value2 += variant
            }
            "x^2" -> {
                value2 += variant
            }
            "sqrt(x)" -> {
                value2 += variant
            }
            "1/x" -> {
                value2 += variant
            }
            "%" -> {
                value2 += variant
            }
            else -> {
                value1 += variant
            }
        }
    }

}