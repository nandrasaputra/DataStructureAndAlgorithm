package problems.leetcode

object GreatestOfCandy {
    class Solution {
        fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
            val result = BooleanArray(candies.size) {false}
            var greatestCandies = 0
            candies.forEach {
                if (it > greatestCandies) {
                    greatestCandies = it
                }
            }
            for ((index, value) in candies.withIndex()) {
                if (value + extraCandies >= greatestCandies) {
                    result[index] = true
                }
            }
            return result
        }
    }
}