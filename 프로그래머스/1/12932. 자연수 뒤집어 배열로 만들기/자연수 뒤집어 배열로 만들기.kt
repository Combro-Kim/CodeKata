class Solution {
    fun solution(n: Long): IntArray = n.toString().reversed().map { i -> i.toString().toInt() }.toIntArray()
}