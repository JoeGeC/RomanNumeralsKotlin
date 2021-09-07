package com.mkodo.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsShould {
    private val romanNumerals = RomanNumerals()

    @Test
    fun `Convert 1 to I`() {
        assertEquals("I", romanNumerals.convert(1))
    }

    @Test
    fun `Convert 2 to II`() {
        assertEquals("II", romanNumerals.convert(2))
    }

    @Test
    fun `Convert 3 to III`() {
        assertEquals("III", romanNumerals.convert(3))
    }

    @Test
    fun `Convert 5 to V`() {
        assertEquals("V", romanNumerals.convert(5))
    }
}