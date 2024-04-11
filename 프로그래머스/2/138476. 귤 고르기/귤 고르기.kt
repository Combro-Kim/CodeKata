class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var k = k

        val listMap = hashMapOf<Int, Int>()
        tangerine.forEach {
            listMap[it] = (listMap[it] ?: 0) + 1
        }
        val valueList = listMap.values.sortedDescending()

        var cnt = 0
        var sum = 0
        while (k > sum) {
            sum += valueList[cnt]
            answer++
            cnt++
        }
        return answer
    }
}