class Solution {
    fun solution(n: Long) = n.toString().reversed().map { it.toString().toInt() }.toIntArray()
}