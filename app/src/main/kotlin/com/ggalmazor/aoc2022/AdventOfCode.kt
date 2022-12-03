/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
@file:Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package com.ggalmazor.aoc2022

import com.ggalmazor.aoc2022.days.Day

private const val MAX_DAY = 3

class AdventOfCode {
    fun run() {
        (1..MAX_DAY).forEach {
            val day = Day.get(it)
            println(day.partOne(readDay(it, 1)))
            println(day.partTwo(readDay(it, 2)))
        }
    }

    private fun readDay(it: Int, part: Int): String {
        return AdventOfCode::class.java.getResource("/com/ggalmazor/aoc2022/days/day${it}_part${part}.txt").readText()
    }
}

fun main() {
    AdventOfCode().run()
}
