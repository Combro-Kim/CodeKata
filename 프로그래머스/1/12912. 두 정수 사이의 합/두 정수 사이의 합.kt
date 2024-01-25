class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum: Long = 0
        var a_num = a
        var b_num = b
        if (b<a) {
            a_num = b
            b_num = a
        }
        for (i in a_num..b_num) {
            sum += i
        }
        return sum
    }
}