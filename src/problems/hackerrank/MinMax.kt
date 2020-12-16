package problems.hackerrank

fun maxMin(k: Int, arr: Array<Int>): Int {

    val n = arr.size
    val sortedArray = arr.sortedArray()

    var answer = Int.MAX_VALUE

    for (index in 0..(n-k)) {

        val minElement = sortedArray[index]
        val maxElement = sortedArray[index+k-1]

        val maxMinusMin = maxElement - minElement
        answer = Math.min(maxMinusMin, answer)

        println("maxElement = $maxElement, minElement = $minElement, maxMinusMin = $maxMinusMin")
    }

    return answer

}