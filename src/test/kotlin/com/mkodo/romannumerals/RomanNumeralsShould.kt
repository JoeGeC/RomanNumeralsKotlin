package com.mkodo.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsShould {
    private val romanNumerals = RomanNumerals()

    @Test
    fun `convert units of 1`() {
        assertEquals("I", romanNumerals.convert(1))
        assertEquals("II", romanNumerals.convert(2))
        assertEquals("III", romanNumerals.convert(3))
        assertEquals("V", romanNumerals.convert(5))
        assertEquals("VI", romanNumerals.convert(6))
        assertEquals("VII", romanNumerals.convert(7))
    }

    @Test
    fun `convert units of 10`() {
        assertEquals("X", romanNumerals.convert(10))
        assertEquals("XI", romanNumerals.convert(11))
        assertEquals("XV", romanNumerals.convert(15))
        assertEquals("XX", romanNumerals.convert(20))
        assertEquals("XXX", romanNumerals.convert(30))
        assertEquals("XXXVIII", romanNumerals.convert(38))
        assertEquals("L", romanNumerals.convert(50))
    }
}