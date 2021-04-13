package problems.leetcode

import java.lang.StringBuilder

object DefangingIP {
    fun defangIPaddr(address: String): String {
        val resultStringBuilder = StringBuilder()
        address.forEach {
            if (it == '.') {
                resultStringBuilder.append("[.]")
            } else {
                resultStringBuilder.append(it)
            }
        }
        return resultStringBuilder.toString()
    }
}