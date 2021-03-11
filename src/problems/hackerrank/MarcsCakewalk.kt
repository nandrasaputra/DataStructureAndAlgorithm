package problems.hackerrank

fun marcsCakewalk(calorie: Array<Int>): Long {
    var totalMiles: Long = 0
    val sortedCalorie = calorie.sortedArrayDescending()
    for (index in sortedCalorie.indices) {
        totalMiles += sortedCalorie[index] * Math.pow(2.0, index.toDouble()).toLong()
    }
    return totalMiles
}