package com.example.view

import javafx.scene.image.Image
import tornadofx.View
import tornadofx.borderpane

class MainView : View("Calculator TornadoFX") {

    private val calculatorView: CalculatorView by inject()

    override val root = borderpane {
        // Icons
        primaryStage.icons.add(Image("calc.png"))
        // load Scene
        center = calculatorView.root
    }
}





