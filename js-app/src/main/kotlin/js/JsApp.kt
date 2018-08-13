package js

import com.seanshubin.condorcet.common.Condorcet
import com.seanshubin.condorcet.js.SampleData
import kotlin.browser.document

fun main(arguments: Array<String>) {
    val     inputLines = SampleData.sampleInput
    document.writeln("<h2>Input</h2>")
    document.writeln("<pre>")
    document.writeln(inputLines.size.toString())
    inputLines.forEach{document.writeln(it)}
    document.writeln("</pre>")

    val outputLines = Condorcet.processLines(inputLines)
    document.writeln("<h2>Output</h2>")
    document.writeln("<pre>")
    outputLines.forEach{document.writeln(it)}
    document.writeln("</pre>")
}

private fun header(text: String) {
    println()
    println("##### $text #####")
}

