package com.seanshubin.condorcet.common

object Condorcet {
    fun processLines(input: List<String>): List<String> {
        val election = Election.fromLines(input)
        val talliedElection = election.tally()
        return talliedElection.toLines()
    }
}
