class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var arr1 = intArrayOf(1, 2, 3, 4, 5)
        var arr2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var arr3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var cnt = arrayOf(0, 0, 0)

        for (i in answers.indices) {
            if (answers[i] == arr1[i % 5]) {
                cnt[0] += 1
            }
            if (answers[i] == arr2[i % 8]) {
                cnt[1] += 1
            }
            if (answers[i] == arr3[i % 10]) {
                cnt[2] += 1
            }
        }
        val cntMax = cnt.maxOrNull()
        for (i in cnt.indices) {
            if (cnt[i] == cntMax) {
                answer += i+1
            }
        }
        return answer
    }
}