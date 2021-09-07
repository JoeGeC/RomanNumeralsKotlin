package com.mkodo.romannumerals

class RomanNumerals {
    fun convert(number: Int): String {
        var count = number
        var result = ""

        arrayOf(50, 10, 5, 1).forEach {
            while (count >= it) {
                result += numeralFor(it)
                count -= it
            }
        }

        return result
    }

    private fun numeralFor(i: Int): String {
        if (i == 50) return "L"
        if (i == 10) return "X"
        if (i == 5) return "V"
        return "I"
    }
}
