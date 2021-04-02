package problems.hackerrank

import java.lang.StringBuilder

fun caesarCipher(s: String, k: Int): String {
    val resultStringBuilder = StringBuilder()
    s.forEach {
        if (it.isUpperCase()) {
            val base = 'A'.toInt()
            val cipheredChar = (base + ((it.toInt() + k - base) % 26)).toChar()
            resultStringBuilder.append(cipheredChar)
        } else if (it.isLowerCase()) {
            val base = 'a'.toInt()
            val cipheredChar = (base + ((it.toInt() + k - base) % 26)).toChar()
            resultStringBuilder.append(cipheredChar)
        } else {
            resultStringBuilder.append(it)
        }
    }
    return resultStringBuilder.toString()
}