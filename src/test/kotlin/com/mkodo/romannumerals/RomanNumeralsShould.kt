package com.mkodo.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsShould {
    @Test
    fun `Convert 1 to I`() {
        val romanNumerals = RomanNumerals()
        assertEquals("I", romanNumerals.convert(1))
    }
    @Test
    fun `Convert 2 to II`() {
        val romanNumerals = RomanNumerals()
        assertEquals("II", romanNumerals.convert(2))
    }
}