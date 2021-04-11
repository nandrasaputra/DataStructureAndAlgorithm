package problems.leetcode

import java.math.BigInteger

object NumberOfGoodPair {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0
        val mapOfNumberCount = mutableMapOf<Int, Int>()
        nums.forEach {
            mapOfNumberCount[it] = mapOfNumberCount.getOrDefault(it, 0) + 1
        }
        mapOfNumberCount.values.forEach { numberCount ->
            if (numberCount >= 2) {
                result += (combination(numberCount, 2)).toInt()
            }
        }
        return result
    }

    private fun combination(n: Int, k: Int): BigInteger {
        val fact = (2..k).fold(BigInteger.ONE) { acc, i -> acc * BigInteger.valueOf(i.toLong()) }
        return permutation(n, k) / fact
    }

    private fun permutation(n: Int, k: Int): BigInteger {
        return (n - k + 1..n).fold(BigInteger.ONE) { acc, i ->
            acc * BigInteger.valueOf(i.toLong())
        }
    }
}