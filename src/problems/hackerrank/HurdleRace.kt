package problems.hackerrank

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    val hurdleMaxHeight = height.max() ?: 0
    if (k >= hurdleMaxHeight) {
        return 0
    } else {
        return hurdleMaxHeight - k
    }
}