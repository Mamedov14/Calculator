package com.example.view

import javafx.beans.property.SimpleStringProperty
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*
import javax.script.ScriptEngineManager

class CalculatorView : View("My View") {


    private val buttonWidth: Double = 75.0
    private val buttonHeight: Double = 50.0

    private var textFieldStringProperty = SimpleStringProperty()
    private var value1: String = ""
    private var value2: String = ""
    private var sign: String = ""


    override val root = vbox {
//        setPrefSize(500.0, 500.0)

        // Scene //
        label("Calculator")
        hbox {
            textfield {
                setPrefSize(300.0, 75.0)
                isDisable = true
                style {
                    fontWeight = FontWeight.BLACK
                    backgroundColor += Color.WHITE
                    textFill = Color.BLACK
                    fontSize = 20.px
                }
            }.bind(textFieldStringProperty)
        }

        // BOX 1 //
        hbox {
            button("%") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "%"
                }
            }
            button("CE") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    value2 = ""
                }
            }
            button("C") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    value1 = ""
                    value2 = ""
                    sign = ""
                }
            }
            button("Back") {
                setPrefSize(buttonWidth, buttonHeight)
                isDisable = true
                action {

                }
            }
        }

        // BOX 2 //
        hbox {
            button("1/x") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "1/x"
                }

            }
            button("x^2") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "x^2"
                }
            }
            button("sqrt(x)") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "sqrt(x)"
                }
            }
            button("/") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "/"
                }
            }
        }

        // BOX 3 //
        hbox {
            button("7") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("7")
                }
            }
            button("8") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("8")
                }
            }
            button("9") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("9")
                }
            }
            button("*") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "*"
                }
            }
        }

        // BOX 4 //
        hbox {
            button("4") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("4")
                }
            }
            button("5") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("5")
                }
            }
            button("6") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("6")
                }
            }
            button("-") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "-"
                }
            }
        }

        // BOX 5 //
        hbox {
            button("1") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("1")
                }
            }
            button("2") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("2")
                }
            }
            button("3") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("3")
                }
            }
            button("+") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    sign = "+"
                }
            }
        }

        // BOX 6 //
        hbox {
            button("+/-") {
                setPrefSize(buttonWidth, buttonHeight)
                action {

                }
                isDisable = true
            }
            button("0") {
                setPrefSize(buttonWidth, buttonHeight)
                action {
                    activeVariant("0")
                }
            }
            button(",") {
                setPrefSize(buttonWidth, buttonHeight)
                action {

                }
                isDisable = true
            }
            button("=") {
                setPrefSize(buttonWidth, buttonHeight)
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