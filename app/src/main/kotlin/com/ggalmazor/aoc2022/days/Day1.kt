package com.ggalmazor.aoc2022.days

class Day1 : Day {
    override fun partOne(input: String): String {
        return parseElves(input).maxOf { it }
            .toString()
    }

    override fun partTwo(input: String): String {
        return parseElves(input)
            .sortedBy { it }.reversed()
            .take(3).sum()
            .toString()
    }

    private fun parseElves(input: String): List<Int> {
        return input.split("\n").fold(mutableListOf(0)) { acc, it ->
            if (it.trim() == "")
                acc.add(0)
            else
                acc[acc.lastIndex] = acc.last() + Integer.parseInt(it)
            acc
        }.toList()
    }
}
