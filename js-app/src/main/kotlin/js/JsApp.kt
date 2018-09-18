package js

import com.seanshubin.condorcet.common.backend.Condorcet
import com.seanshubin.condorcet.common.backend.Ranking
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

fun HtmlBlockTag.myFieldSet(name: String, block: () -> Unit) {
    fieldSet {
        legend { +name }
        block()
    }
}

fun HtmlBlockTag.login() {
    myFieldSet("login") {
        myInput("EMail")
        myPassword("Password")
        myButton("Login")
    }
}

fun HtmlBlockTag.myStyle() {
    style {
        +"""
            * {
                box-sizing: border-box;
            }

            .label {
                width: 25%;
                float: left;
            }

            .entry {
                width: 75%;
                float: left;
            }

            ul {
                list-style-type: none;
                padding: 0;
                margin: 0;
            }

            body {
                background-color: #CCCCFF;
            }

            .ranking-input{
                width: 2em;
                margin-right: 1em;
            }
        """.trimIndent()
    }
}

fun HtmlBlockTag.myInput(text: String) {
    div {
        span("label") {
            +text
        }
        input(classes = "entry")
    }
}

fun HtmlBlockTag.myPassword(text: String) {
    div {
        span("label") {
            +text
        }
        input(classes = "entry")
    }
}

fun HtmlBlockTag.myButton(text: String) {
    div {
        button {
            +text
        }
    }
}

fun HtmlBlockTag.register() {
    myFieldSet("register") {
        myInput("EMail")
        myPassword("Password")
        myPassword("Confirm Password")
        myButton("Register")
    }
}

fun HtmlBlockTag.elections(electionNames: List<String>) {
    myFieldSet("elections") {
        ul {
            for (electionName in electionNames) {
                li {
                    a(href = electionName) {
                        +electionName
                    }
                }
            }
        }
    }
}

fun HtmlBlockTag.home() {
    myFieldSet("home") {
        elections(listOf("Election 1", "Election 2", "Election 3"))
        myButton("Create Election")
        myButton("Logout")
    }
}

fun HtmlBlockTag.renderRankingInput() {
    input(classes = "ranking-input")
}

fun HtmlBlockTag.renderRanking(ranking: Ranking) {
    div {
        renderRankingInput()
        +ranking.candidate
    }
}

fun HtmlBlockTag.election(name: String, rankings: List<Ranking>) {
    myFieldSet("election $name") {
        for (ranking in rankings) {
            renderRanking(ranking)
        }
    }
}

fun main(arguments: Array<String>) {
    document.body!!.append.div() {
        myStyle()
        login()
        register()
        home()
        election(SampleData.election, SampleData.rankings)
        displayInputLines()
        displayOutputLines()
    }
}
