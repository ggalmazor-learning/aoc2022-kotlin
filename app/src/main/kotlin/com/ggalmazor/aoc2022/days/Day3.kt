package com.ggalmazor.aoc2022.days

class Day3 : Day {
    override fun partOne(input: String): String {
        val repeatedChars = input.split("\n")
            .map(String::trim)
            .filter(String::isNotEmpty)
            .map { line ->
                val halfLength = line.length / 2
                val firstHalf = line.take(halfLength)
                val secondHalf = line.reversed().take(halfLength)
                findRepeatedChars(firstHalf, secondHalf).first()
            }
        return repeatedChars.map(::priorityOf).sum().toString()
    }

    override fun partTwo(input: String): String {
        val lines = input.split("\n").map(String::trim).filter(String::isNotEmpty)
        val groups = lines.windowed(3, 3)
        val repeatedChars = groups.map { group -> group.reduce(::findRepeatedChars).first() }
        return repeatedChars.map(::priorityOf).sum().toString()
    }

    private fun priorityOf(char: Char): Int {
        return when {
            char.isLowerCase() -> char.code - 96
            else -> char.code - 65 + 27
        }
    }

    private fun findRepeatedChars(left: String, right: String): String {
        return left.filter { right.contains(it) }
    }
}
