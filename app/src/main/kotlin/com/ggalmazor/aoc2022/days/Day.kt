package com.ggalmazor.aoc2022.days

interface Day {
    fun partOne(input: String): String
    fun partTwo(input: String): String

    companion object {
        fun get(number: Int): Day {
            when (number) {
                1 -> return Day1()
                2 -> return Day2()
                3 -> return Day3()
                4 -> return Day4()
                else -> throw IllegalArgumentException()
            }
        }
    }

}

