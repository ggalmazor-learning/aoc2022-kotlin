package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

private const val EXAMPLE_INPUT = """
            vJrwpWtwJgWrhcsFMMfFFhFp
            jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
            PmmdzqPrVvPwwTWBwg
            wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
            ttgJtRGJQctTZtZT
            CrZsJsPPZsGzwwsLwLmpwMDw
        """


class Day3Test {
    @Test
    fun partOne_example() {
        assertThat(Day3().partOne(EXAMPLE_INPUT.trimIndent()), equalTo("157"))
    }

    @Test
    fun partTwo_exaple() {
        assertThat(Day3().partTwo(EXAMPLE_INPUT.trimIndent()), equalTo("11111"))
    }
}
