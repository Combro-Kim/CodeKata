class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        val all = brown + yellow

        for (y in 3..all / 3) {
            val x = all / y
            if ((x - 2) * (y - 2) == yellow) {
                answer += x
                answer += y
                break
            }
        }
        return answer
    }
}