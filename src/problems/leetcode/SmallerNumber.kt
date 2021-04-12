package problems.leetcode

object SmallerNumber {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val countMap = mutableMapOf<Int, Int>()
        nums.forEach {
            countMap[it] = countMap.getOrDefault(it, 0) + 1
        }
        val sortedCountMap = countMap.toSortedMap()

        var currentTotal = 0
        val sumMap = mutableMapOf<Int, Int>()
        sortedCountMap.forEach { (key, value) ->
            sumMap[key] = currentTotal
            currentTotal += value
        }

        val resultArray = IntArray(nums.size) {0}
        for (index in nums.indices) {
            val targetNumber = nums[index]
            resultArray[index] = sumMap.getOrDefault(targetNumber, 0)
        }
        return resultArray
    }
}