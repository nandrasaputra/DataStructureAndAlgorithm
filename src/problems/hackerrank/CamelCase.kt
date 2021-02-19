package problems.hackerrank

fun camelcase(s: String): Int {
    return s.split(Regex("[A-Z]"), 0).size
}