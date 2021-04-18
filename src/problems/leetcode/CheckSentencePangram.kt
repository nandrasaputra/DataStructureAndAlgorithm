package problems.leetcode

object CheckSentencePangram {
    fun checkIfPangram(sentence: String): Boolean {
        if(sentence.length < 26) {
            return false
        } else {
            val charSet = mutableSetOf<Char>()
            sentence.forEach {
                charSet.add(it)
            }
            return charSet.size == 26
        }
    }
}