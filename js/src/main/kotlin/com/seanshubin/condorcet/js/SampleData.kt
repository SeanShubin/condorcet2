package com.seanshubin.condorcet.js

object SampleData {
    val sampleInput: List<String> = """
candidates (name)
    minor-improvements
    radical-changes
    status-quo
eligible-to-vote (name)
    Alice
    Bob
    Carol
    Dave
    Eve
    Frank
    Grace
    Heidi
    Ivy
    Judy
ballots (name confirmation { rank candidate })
    Alice 980fb0c0-77ba-4ffb-be3b-ef190a7f14ce 1 minor-improvements 2 status-quo         3 radical-changes
    Bob   87c257bc-be9f-4edf-81ac-fc8d0687745e 1 minor-improvements 2 status-quo         3 radical-changes
    Carol 0ad21976-c551-464f-be68-b61fcbbfd85a 1 minor-improvements 2 status-quo         3 radical-changes
    Dave  f68f82d5-ef9d-4f9d-9e29-5f9fc2fbc8e1 1 status-quo         2 minor-improvements 3 radical-changes
    Eve   051a5a89-9242-4381-8067-55d5bac12775 1 status-quo         2 minor-improvements 3 radical-changes
    Frank 9afb4b66-1023-438a-a81f-e4783b3f45ce 1 status-quo         2 minor-improvements 3 radical-changes
    Grace 0023a873-c36f-48f0-b25a-6206c2602ee6 1 radical-changes    2 minor-improvements 3 status-quo
    Heidi f88fd252-c170-4927-8ab8-b8e1a49800dd 1 radical-changes    2 minor-improvements 3 status-quo
    Ivy   a971633e-db3f-4c3f-8d14-f4c9516b5c93 1 radical-changes    2 minor-improvements 3 status-quo
    Judy  0bee5954-167e-4798-a7ba-946e63b32aff 1 radical-changes    2 minor-improvements 3 status-quo
""".trim().split("\r\n", "\r", "\n")

    val election1 = "Election 1"
    val election2 = "Election 2"
    val election3 = "Election 3"
    val electionNames = listOf(election1, election2, election3)
    val candidate1 = "Alice"
    val candidate2 = "Bob"
    val candidate3 = "Carol"
    val candidates = listOf(candidate1, candidate2, candidate3)
    val candidateRanking1 = Ranking(1, candidate1)
    val candidateRanking2 = Ranking(2, candidate2)
    val candidateRanking3 = Ranking(3, candidate3)
    val rankings = listOf(candidateRanking1, candidateRanking2, candidateRanking3)
}
