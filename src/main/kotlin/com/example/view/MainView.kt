package com.example.view

import tornadofx.View
import tornadofx.borderpane

class MainView : View("Calculator TornadoFX") {

    private val calculatorView: CalculatorView by inject()

    override val root = borderpane {

        center = calculatorView.root
    }
}





