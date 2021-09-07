package com.mkodo.romannumerals

class RomanNumerals {
    fun convert(number: Int): String {
        var count = number
        var result = ""

        if (count >= 10) {
            result += "X"
            count -= 10
        }

        if (count >= 5) {
            result += "V"
            count -= 5
        }
        for (i in 1..count) result += "I"
        return result
    }
}
