package com.ggalmazor.aoc2022.days

class Day4 : Day {
    override fun partOne(input: String): String {
        val lines = input.split("\n").filter { it.isNotBlank() }.map { it.trim() }
        return lines.map { line ->
            line.split(",").map {
                val (start, end) = it.split("-").map(Integer::parseInt)
                IntRange(start, end)
            }
        }.filter { ranges ->
            ranges[0].subtract(ranges[1]).isEmpty() || ranges[1].subtract(ranges[0]).isEmpty()
        }.size.toString()
    }

    override fun partTwo(input: String): String {
        val lines = input.split("\n").filter { it.isNotBlank() }.map { it.trim() }
        return lines.map { line ->
            line.split(",").map {
                val (start, end) = it.split("-").map(Integer::parseInt)
                IntRange(start, end)
            }
        }.filter { ranges ->
            ranges[0].intersect(ranges[1]).isNotEmpty()
        }.size.toString()
    }
}
