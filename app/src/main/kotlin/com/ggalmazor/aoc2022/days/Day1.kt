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

    private fun parseElves(input: String): MutableList<Int> {
        val elves = mutableListOf<Int>()
        var currentElf = 0
        input.split("\n").forEach {
            if (it.trim() == "") {
                elves.add(currentElf)
                currentElf = 0
            } else {
                currentElf += Integer.parseInt(it)
            }
        }
        elves.add(currentElf)
        return elves
    }
}
