package problems.leetcode

object HighestAltitude {
    fun largestAltitude(gain: IntArray): Int {
        var highestAltitude = 0
        var currentAltitude = 0
        gain.forEach {
            val newAltitude = currentAltitude + it
            if (newAltitude > highestAltitude) {
                highestAltitude = newAltitude
            }
            currentAltitude += it
        }
        return highestAltitude
    }
}