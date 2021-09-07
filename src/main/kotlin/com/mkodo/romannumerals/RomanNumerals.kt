package com.mkodo.romannumerals

class RomanNumerals {
    fun convert(number: Int): String {
        var count = number
        var result = ""

        while (count >= 10) {
            result += numeralFor(10)
            count -= 10
        }

        while (count >= 5) {
            result += numeralFor(5)
            count -= 5
        }

        while (count >= 1) {
            result += numeralFor(1)
            count -= 1
        }

        return result
    }

    private fun numeralFor(i: Int): String {
        if (i == 10) return "X"
        if (i == 5) return "V"
        return "I"
    }
}
