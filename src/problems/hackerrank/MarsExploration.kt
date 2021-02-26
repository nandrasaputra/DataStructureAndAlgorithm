package problems.hackerrank

fun marsExploration(s: String): Int {
    var count = 0
    for (index in s.indices) {
        if (s[index] != "SOS"[index % 3]) {
            count++
        }
    }
    return count
}