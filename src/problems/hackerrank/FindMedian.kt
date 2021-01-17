package problems.hackerrank

fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    val targetIndex = ((arr.size - 2) / 2) + 1
    return arr[targetIndex]
}