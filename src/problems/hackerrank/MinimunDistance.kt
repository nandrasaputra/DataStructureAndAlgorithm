package problems.hackerrank

import kotlin.math.min

fun minimumDistances(a: Array<Int>): Int {
    val numberToIndexMap = mutableMapOf<Int, Int>()
    var minDistance = Int.MAX_VALUE
    for ((index, value) in a.withIndex()) {
        if (numberToIndexMap.containsKey(value)) {
            val prevIndex = numberToIndexMap[value]!!
            val distance = index - prevIndex
            if (distance < minDistance) {
                minDistance = distance
            }
        }
        numberToIndexMap[value] = index
    }

    return if (minDistance == Int.MAX_VALUE) {
        -1
    } else {
        minDistance
    }
}