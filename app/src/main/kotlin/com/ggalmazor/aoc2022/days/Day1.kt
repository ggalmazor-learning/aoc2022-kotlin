package com.ggalmazor.aoc2022.days

class Day1 : Day {
    override fun partOne(input: String): String {
        val elves = parseElves(input)

        return elves.maxOf { it }.toString()
    }

    override fun partTwo(input: String): String {
        val elves = parseElves(input)

        val top3 = elves.sortedBy { it }.reversed().take(3)
        return top3.sum().toString()
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
