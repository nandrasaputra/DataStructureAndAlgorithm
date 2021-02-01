package problems.hackerrank

fun equalizeArray(arr: Array<Int>): Int {
    val numberMap = mutableMapOf<Int, Int>()
    arr.forEach {
        numberMap[it] = numberMap.getOrDefault(it, 0) + 1
    }
    val maxEntry = numberMap.maxBy { it.value}
    val totalValue = numberMap.values.sum()
    return totalValue - (maxEntry?.value ?: 0)
}