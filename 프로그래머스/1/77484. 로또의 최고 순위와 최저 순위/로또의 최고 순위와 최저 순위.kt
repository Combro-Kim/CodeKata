class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var zero = lottos.count { e -> e == 0 }
        var low = 0

        lottos.forEach { if (win_nums.contains(it)) low += 1 }

        answer += when (zero + low) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        answer += when (low) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        return answer
    }
}