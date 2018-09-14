package js

import com.seanshubin.condorcet.common.backend.Condorcet
import com.seanshubin.condorcet.js.SampleData
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.h2
import kotlinx.html.pre
import kotlin.browser.document

fun main(arguments: Array<String>) {
    val condorcetDiv = document.body!!.append.div()

    val inputLines = SampleData.sampleInput
    condorcetDiv.append {
        h2 {
            +"Input"
        }
        pre {
            +inputLines.joinToString("\n")
        }
    }

    val outputLines = Condorcet.processLines(inputLines)
    condorcetDiv.append {
        h2 {
            +"Output"
        }
        pre {
            +outputLines.joinToString("\n")
        }
    }
}
