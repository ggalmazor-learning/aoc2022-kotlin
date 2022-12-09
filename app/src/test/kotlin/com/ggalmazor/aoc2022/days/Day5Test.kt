package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

private const val EXAMPLE_INPUT = """    [D]    
[N] [C]    
[Z] [M] [P]
 1   2   3 

move 1 from 2 to 1
move 3 from 1 to 3
move 2 from 2 to 1
move 1 from 1 to 2
"""


class Day5Test {
    @Test
    fun partOne_example() {
        MatcherAssert.assertThat(Day5().partOne(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("CMZ"))
    }

    @Test
    fun partTwo_exaple() {
        MatcherAssert.assertThat(Day5().partTwo(EXAMPLE_INPUT.trimIndent()), Matchers.equalTo("MCD"))
    }
}
