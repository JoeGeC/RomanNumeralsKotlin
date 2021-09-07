package com.mkodo.romannumerals

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsShould {
    @Test
    fun `Convert 1 to I`(){
        val romanNumerals = RomanNumerals()
        assertEquals("I", romanNumerals.convert(1))
    }
}