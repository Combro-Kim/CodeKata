import java.util.Collections

class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var str = my_string.toList()
        Collections.swap(str,num1,num2)

        return str.joinToString("")
    }
}