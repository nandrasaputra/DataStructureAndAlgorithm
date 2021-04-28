package problems.leetcode

object TruncateSentences {
    fun truncateSentence(s: String, k: Int): String {
        return s.split(" ").take(k).reduce { last, next ->
            last + " "+ next
        }
    }
}