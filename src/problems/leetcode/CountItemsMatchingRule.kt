package problems.leetcode

object CountItemsMatchingRule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var resultCount = 0
        val targetIndex = when(ruleKey) {
            "type" -> 0
            "color" -> 1
            else -> 2
        }
        items.forEach {
            if (it[targetIndex] == ruleValue) {
                resultCount++
            }
        }
        return resultCount
    }
}