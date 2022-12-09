package com.ggalmazor.aoc2022.days

class Day6 : Day {
    override fun partOne(input: String): String {
        val leftMostPacketIndex = input.windowed(4, 1).indexOfFirst { packet ->
            val hashSet = HashSet<Char>(packet.toList())
            hashSet.size == 4
        }
        return (leftMostPacketIndex + 4).toString()
    }

    override fun partTwo(input: String): String {
        val leftMostPacketIndex = input.windowed(14, 1).indexOfFirst { packet ->
            val hashSet = HashSet<Char>(packet.toList())
            hashSet.size == 14
        }
        return (leftMostPacketIndex + 14).toString()
    }
}
