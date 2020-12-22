package problems.leetcode

import java.lang.StringBuilder

/*
    LeetCode Problem : Reformat Phone Number
    https://leetcode.com/problems/reformat-phone-number/

    Example :
    Input: number = "1-23-45 6"
    Output: "123-456"
    Explanation: The digits are "123456".
    Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
    Step 2: There are 3 digits remaining, so put them in a single block of length 3. The 2nd block is "456".
    Joining the blocks gives "123-456".
* */

object ReformatPhoneNumber {
    class Solution {
        fun reformatNumber(number: String): String {
            val pattern = Regex("[0-9]")
            val number = StringBuilder()
            number.forEach {
                val num = it.toString()
                if (pattern.matches(num)) {
                    number.append(num)
                }
            }

            return getFormattedNumber(number.toString())
        }

        private fun getFormattedNumber(number: String) : String {
            val remainder = number.length % 3
            val normalNumber = number.substring(0, number.length-3)
            val remainderNumber = number
            return ""
        }
    }
}