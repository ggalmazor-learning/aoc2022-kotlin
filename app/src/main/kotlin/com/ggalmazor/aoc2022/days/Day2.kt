package com.ggalmazor.aoc2022.days

private val SCORES = mapOf(
    "A X" to 4,
    "A Y" to 8,
    "A Z" to 3,
    "B X" to 1,
    "B Y" to 5,
    "B Z" to 9,
    "C X" to 7,
    "C Y" to 2,
    "C Z" to 6,
)

class Day2 : Day {
    override fun partOne(input: String): String {
        return input.split("\n").map(::getScore).sum().toString()
    }

    override fun partTwo(input: String): String {
        return ""
    }

    private fun getScore(round: String): Int {
        if (round.trim() == "")
            return 0

        return SCORES[round]!!
    }
}
