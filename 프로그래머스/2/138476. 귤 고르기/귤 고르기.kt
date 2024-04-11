class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        val list = tangerine.groupBy { it }.values.map { it.size }.toList().sortedDescending()
//        val sortList = list.sortedDescending()
        var cnt = 0
        list.takeWhile {
            cnt += it
            answer++
            cnt < k
        }
        return answer
    }
}