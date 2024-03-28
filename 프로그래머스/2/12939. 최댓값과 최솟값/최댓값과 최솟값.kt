class Solution {
    fun solution(s: String): String {
        val arrS = s.split(' ').map { it.toInt() }
        return "${arrS.minOrNull()} ${arrS.maxOrNull()}"
    }
}