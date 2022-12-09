package com.ggalmazor.aoc2022.days

import org.hamcrest.MatcherAssert.*
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test

class Day6Test {
    @Test
    fun partOne_example() {
        assertThat(Day6().partOne("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), equalTo("7"))
        assertThat(Day6().partOne("bvwbjplbgvbhsrlpgdmjqwftvncz"), equalTo("5"))
        assertThat(Day6().partOne("nppdvjthqldpwncqszvftbrmjlhg"), equalTo("6"))
        assertThat(Day6().partOne("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), equalTo("10"))
        assertThat(Day6().partOne("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), equalTo("11"))
    }

    @Test
    fun partTwo_exaple() {
        assertThat(Day6().partTwo("mjqjpqmgbljsphdztnvjfqwrcgsmlb"), equalTo("19"))
        assertThat(Day6().partTwo("bvwbjplbgvbhsrlpgdmjqwftvncz"), equalTo("23"))
        assertThat(Day6().partTwo("nppdvjthqldpwncqszvftbrmjlhg"), equalTo("23"))
        assertThat(Day6().partTwo("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), equalTo("29"))
        assertThat(Day6().partTwo("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), equalTo("26"))
    }
}
