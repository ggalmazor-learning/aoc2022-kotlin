package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

private const val EXAMPLE_INPUT = """
            A Y
            B X
            C Z
        """

class Day2Test {
    @Test
    fun partOne_example() {
        assertThat(Day2().partOne(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("15"))
    }

//    @Test
//    fun partTwo_exaple() {
//        MatcherAssert.assertThat(Day2().partTwo(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("45000"))
//    }
}
