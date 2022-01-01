package com.example

import javafx.scene.paint.Color
import tornadofx.Stylesheet
import tornadofx.c
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val button by cssclass()
    }

    init {
        button {
            fontSize = 15.px
            backgroundColor += Color.BLACK
            textFill = c("red")
        }

    }
}