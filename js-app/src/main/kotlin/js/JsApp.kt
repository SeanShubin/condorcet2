package js

import com.seanshubin.condorcet.common.backend.Condorcet
import com.seanshubin.condorcet.js.SampleData
import kotlinx.html.*
import kotlinx.html.dom.append
import kotlin.browser.document

val inputLines = SampleData.sampleInput

fun HtmlBlockTag.displayInputLines() {
    h2 {
        +"Input"
    }
    pre {
        +inputLines.joinToString("\n")
    }
}

fun HtmlBlockTag.displayOutputLines() {
    val outputLines = Condorcet.processLines(inputLines)
    h2 {
        +"Output"
    }
    pre {
        +outputLines.joinToString("\n")
    }
}

fun HtmlBlockTag.login() {
    fieldSet {
        legend { +"login" }
        div {
            +"EMail"
            input()
        }
        div {
            +"Password"
            passwordInput()
        }
        div {
            button {
                +"Login"
            }
        }
    }
}

fun HtmlBlockTag.style() {
    style {
        +"""
            body {
                background-color: linen;
            }
        """.trimIndent()
    }
}

fun HtmlBlockTag.register() {
    fieldSet {
        legend { +"register" }
        div {
            +"EMail"
            input()
        }
        div {
            +"Password"
            passwordInput()
        }
        div {
            +"Confirm Password"
            passwordInput()
        }
        div {
            button {
                +"Register"
            }
        }
    }
}

fun main(arguments: Array<String>) {
    document.body!!.append.div() {
        style()
        login()
        register()
        displayInputLines()
        displayOutputLines()
    }
}
