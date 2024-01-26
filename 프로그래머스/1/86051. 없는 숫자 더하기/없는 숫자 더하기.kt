class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var arr = intArrayOf()

        for (i in 0..9) {
            arr += i
        }
        for (i in arr) {
            if (i in numbers) {
                continue
            } else {
                answer += i
            }
        }

        return answer
    }
}