package js

import com.seanshubin.condorcet.common.backend.Condorcet
import com.seanshubin.condorcet.js.SampleData
import kotlinx.html.div
import kotlin.browser.document
import kotlinx.html.dom.*
import kotlinx.html.p

fun main(arguments: Array<String>) {
    val node = document.body!!.append.div {
        p {
            +"test"
        }
    }
    val text = node.outerHTML
    document.writeln(text)

    val inputLines = SampleData.sampleInput
    document.writeln("<h2>Input</h2>")
    document.writeln("<pre>")
    document.writeln(inputLines.size.toString())
    inputLines.forEach { document.writeln(it) }
    document.writeln("</pre>")

    val outputLines = Condorcet.processLines(inputLines)
    document.writeln("<h2>Output</h2>")
    document.writeln("<pre>")
    outputLines.forEach { document.writeln(it) }
    document.writeln("</pre>")

}
