class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0

        val list = tangerine.groupBy { it }.values.map { it.size }
        
        val sortList = list.sortedDescending()
        var cnt = 0
        sortList.takeWhile {
            cnt += it
            answer++
            cnt < k
        }
        return answer
    }
}