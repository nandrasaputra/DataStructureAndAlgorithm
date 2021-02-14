package problems.hackerrank

fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    var tripletsCount = 0
    val numberSet = mutableSetOf<Int>()
    for (number in arr) {
        if (numberSet.containsAll(listOf(number-d, number - (2*d)))) {
            tripletsCount++
        }
        numberSet.add(number)
    }

    return tripletsCount
}