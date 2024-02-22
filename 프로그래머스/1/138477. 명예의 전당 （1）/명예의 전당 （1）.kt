class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var tear = mutableListOf<Int>()

        for (i in score) {
            if (tear.size < k) {
                tear.add(i)
            } else if (tear[0] < i) {
                tear[0] = i
            }
            tear.sort()
            answer += tear[0]
        }
        return answer
    }
}