package problems.hackerrank

fun strangeCounter(t: Long): Long {
    var time = t
    var factor = 3
    while (time > factor) {
        time -= factor
        factor *= 2
    }
    return factor-time+1
}