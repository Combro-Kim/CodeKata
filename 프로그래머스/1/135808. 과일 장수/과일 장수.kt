class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()

        for (i in 0 until score.size / m) {
            var arr = intArrayOf()
            var cnt = m * i
            for (j in 0 until m) {
                arr += score[j + cnt]
            }
            answer += arr[m-1] * m
        }

        return answer
    }
}