package com.mkodo.romannumerals

class RomanNumerals {
    fun convert(number: Int): String {
        var result = ""
        for (i in 1..number) result += "I"
        return result
    }
}
