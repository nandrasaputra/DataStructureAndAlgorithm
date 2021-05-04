package problems.leetcode

object RobotReturnToOrigin {
    fun judgeCircle(moves: String): Boolean {
        var verticalMagnitude = 0
        var horizontalMagnitude = 0
        moves.forEach {
            when(it) {
                'U' -> { verticalMagnitude++ }
                'D' -> { verticalMagnitude-- }
                'L' -> { horizontalMagnitude-- }
                else -> { horizontalMagnitude++ }
            }
        }
        return (verticalMagnitude == 0 && horizontalMagnitude == 0)
    }
}