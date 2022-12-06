package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

private const val EXAMPLE_INPUT = """2-4,6-8
                                     2-3,4-5
                                     5-7,7-9
                                     2-8,3-7
                                     6-6,4-6
                                     2-6,4-8"""

class Day4Test {
    @Test
    fun partOne_example() {
        MatcherAssert.assertThat(Day4().partOne(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("2"))
    }

    @Test
    fun partTwo_exaple() {
        MatcherAssert.assertThat(Day4().partTwo(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("4"))
    }
}
