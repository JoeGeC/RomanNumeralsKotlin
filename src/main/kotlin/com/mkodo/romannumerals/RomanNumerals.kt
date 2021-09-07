package com.mkodo.romannumerals

class RomanNumerals {
    private val numerals = mapOf(50 to "L", 10 to "X", 5 to "V", 1 to "I")

    fun convert(number: Int): String {
        var count = number
        var result = ""
        numerals.keys.forEach {
            while (count >= it) {
                result += numeralFor(it)
                count -= it
            }
        }
        return result
    }

    private fun numeralFor(i: Int): String {
        return numerals[i] ?: ""
    }
}
