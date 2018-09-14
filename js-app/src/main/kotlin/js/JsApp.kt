package js

import com.seanshubin.condorcet.common.backend.Condorcet
import com.seanshubin.condorcet.js.SampleData
import kotlinx.html.*
import kotlinx.html.dom.append
import org.w3c.dom.HTMLElement
import kotlin.browser.document

class App(private val root: HTMLElement, private val inputLines:List<String>){
    fun input(): List<String> {
        root.append {
            h2 {
                +"Input"
            }
            pre {
                +inputLines.joinToString("\n")
            }
        }
        return inputLines
    }

    fun output() {
        val outputLines = Condorcet.processLines(inputLines)
        root.append {
            h2 {
                +"Output"
            }
            pre {
                +outputLines.joinToString("\n")
            }
        }
    }
}

fun main(arguments: Array<String>) {
    val app = App(document.body!!.append.div(), SampleData.sampleInput)
    app.input()
    app.output()
}
