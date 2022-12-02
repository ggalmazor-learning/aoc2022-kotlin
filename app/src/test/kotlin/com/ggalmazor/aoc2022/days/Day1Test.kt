package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

private const val EXAMPLE_INPUT = """
            1000
            2000
            3000

            4000

            5000
            6000

            7000
            8000
            9000

            10000
        """

class Day1Test {
    @Test
    fun partOne_example() {
        assertThat(Day1().partOne(EXAMPLE_INPUT.trimIndent()), equalTo("24000"))
    }

    @Test
    fun partTwo_exaple() {
        assertThat(Day1().partTwo(EXAMPLE_INPUT.trimIndent()), equalTo("45000"))
    }
}
