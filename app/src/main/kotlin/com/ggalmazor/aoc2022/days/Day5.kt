package com.ggalmazor.aoc2022.days


class Day5 : Day {
    class Move(private val amount: Int, private val fromIndex: Int, private val toIndex: Int) {
        fun execute(stacks: List<ArrayDeque<Char>>, sameOrder: Boolean = false): List<ArrayDeque<Char>> {
            val newStacks = (stacks).map { ArrayDeque(it) }
            val stage = ArrayDeque<Char>()
            repeat(amount) {
                if (sameOrder)
                    stage.add(newStacks[fromIndex].removeLast())
                else
                    stage.addFirst(newStacks[fromIndex].removeLast())
            }
            repeat(amount) {
                newStacks[toIndex].add(stage.removeLast())
            }
            return newStacks
        }

        companion object {
            private val REGEX = Regex("move (\\d+) from (\\d) to (\\d)")

            fun parse(line: String): Move {
                if (line.isBlank())
                    return Move(0, 0, 0)

                val match = REGEX.matchEntire(line)!!
                return Move(
                    match.groups[1]!!.value.toInt(),
                    match.groups[2]!!.value.toInt() - 1,
                    match.groups[3]!!.value.toInt() - 1
                )
            }
        }
    }

    override fun partOne(input: String): String {
        val (stacks, moves) = parse(input)
        return moves
            .fold(stacks) { agg, move -> move.execute(agg) }
            .map { it.last() }
            .joinToString("")
    }

    override fun partTwo(input: String): String {
        val (stacks, moves) = parse(input)
        return moves
            .fold(stacks) { agg, move -> move.execute(agg, true) }
            .map { it.last() }
            .joinToString("")
    }

    private fun parse(input: String): Pair<List<ArrayDeque<Char>>, List<Move>> {
        val lines = input.split("\n")
        val separator = lines.indexOfFirst { line -> line.trim().isEmpty() }
        val initialCratesLines = lines.subList(0, separator - 1)
        val totalSlots = (initialCratesLines.maxOf { it.length } + 1) / 4
        val stacks = (0 until totalSlots).map { ArrayDeque<Char>() }
        val moves = lines.subList(separator + 1, lines.size).map { Move.parse(it) }
        initialCratesLines.forEach { line ->
            "$line ".windowed(4, 4).forEachIndexed { index, crate ->
                if (crate[1] != ' ')
                    stacks[index].addFirst(crate[1])
            }
        }
        return Pair(stacks, moves)
    }
}
