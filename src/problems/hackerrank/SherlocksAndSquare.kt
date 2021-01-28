package problems.hackerrank

fun squares(a: Int, b: Int): Int {
    val aRoot = Math.ceil(Math.sqrt(a.toDouble()))
    val bRoot = Math.floor(Math.sqrt(b.toDouble()))
    if (bRoot - aRoot < 0) {
        return 0
    } else {
        return (bRoot - aRoot).toInt() + 1
    }
}