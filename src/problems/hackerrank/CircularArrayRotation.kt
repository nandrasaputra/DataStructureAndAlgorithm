package problems.hackerrank

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val n = a.size
    val moveCount = k % n
    val resultArray = Array<Int>(queries.size) {0}
    for((arrayIndex, indexAfterRotation) in queries.withIndex()) {
        val initialIndex = ((indexAfterRotation - moveCount) + n) % n
        resultArray[arrayIndex] = a[initialIndex]
    }
    return resultArray
}