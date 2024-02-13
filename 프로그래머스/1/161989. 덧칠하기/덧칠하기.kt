class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var last = 0

        for (i in section) {
            if (i > last) {
                last = i + m - 1
                answer += 1
            }
        }

        return answer
    }
}