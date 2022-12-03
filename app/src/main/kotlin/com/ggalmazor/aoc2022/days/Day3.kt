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
                var repeatedChar = Char(0)
                for (char: Char in firstHalf)
                    if (secondHalf.contains(char)) {
                        repeatedChar = char
                        break
                    }
                repeatedChar
            }
        return repeatedChars.map(::priorityOf).sum().toString()
    }

    override fun partTwo(input: String): String {
        return ""
    }

    private fun priorityOf(char: Char): Int {
        when {
            char.isLowerCase() -> return char.code - 96
            else -> return char.code - 65 + 27
        }
    }
}
