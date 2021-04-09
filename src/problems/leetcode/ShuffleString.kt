package problems.leetcode

object ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val resultStringBuilder = StringBuilder(s)
        for ((index, value) in indices.withIndex()) {
            val currentChar = s[index]
            resultStringBuilder[value] = currentChar
        }
        return resultStringBuilder.toString()
    }
}