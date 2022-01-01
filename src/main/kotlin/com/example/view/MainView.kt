package com.example.view

import javafx.geometry.Pos
import javafx.scene.Parent
import tornadofx.*
import kotlin.math.pow

class MainView : View("Calculator TornadoFX") {

    private val calculatorView: CalculatorView by inject()

    override val root = borderpane {

        center = calculatorView.root
    }
}





