package problems.leetcode

import kotlin.text.StringBuilder

object RemoveOutermostParentheses {
    fun removeOuterParentheses(S: String): String {
        val resultStringBuilder = StringBuilder()
        var lastOuterParentheses = ')'
        var lastOuterParenthesesCount = 1
        S.forEach {
            if (it == lastOuterParentheses) {
                lastOuterParenthesesCount++
                resultStringBuilder.append(it)
            } else {
                lastOuterParenthesesCount--
                if (lastOuterParenthesesCount == 0) {
                    lastOuterParentheses = it
                    lastOuterParenthesesCount = 1
                } else {
                    resultStringBuilder.append(it)
                }
            }
        }
        return resultStringBuilder.toString()
    }
}