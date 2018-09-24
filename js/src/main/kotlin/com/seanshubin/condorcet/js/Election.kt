package com.seanshubin.condorcet.js

data class Election(val name:String,
                    val secretOrPublic: SecretOrPublic,
                    val openOrClosed: ElectionStatus,
                    val candidates:List<String>,
                    val eligibleVoters:List<String>)
