package problems.hackerrank

fun viralAdvertising(n: Int): Int {
    var cumulativeLike = 2
    var people = 5
    for (day in 2..n) {
        people = Math.floor(people.toDouble()/2).toInt() * 3
        cumulativeLike += Math.floor(people.toDouble()/2).toInt()
    }

    return cumulativeLike
}