package problems.hackerrank

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    val n = c.size
    var currentIndexPos = 0
    var energy = 100

    // Initial Jump
    currentIndexPos += (currentIndexPos + k) % n

    //Initial Energy Cost
    energy -= c[currentIndexPos] * 2 + 1

    while (currentIndexPos != 0) {
        currentIndexPos = (currentIndexPos + k) % n
        energy -= c[currentIndexPos] * 2 + 1
    }
    return energy
}