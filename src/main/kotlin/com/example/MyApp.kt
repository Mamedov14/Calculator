package com.example

import com.example.view.MainView
import tornadofx.App
import tornadofx.reloadStylesheetsOnFocus

class MyApp : App(MainView::class, Styles::class) {
//    init {
//        reloadStylesheetsOnFocus()
//    }
}