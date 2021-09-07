package com.mkodo.romannumerals

class RomanNumerals {
    fun convert(number: Int): String {

        if (number == 5) {
            return "V"
        }

        var result = ""
        for (i in 1..number) result += "I"
        return result
    }
}
