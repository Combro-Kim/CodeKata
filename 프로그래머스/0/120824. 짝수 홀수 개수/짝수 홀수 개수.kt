class Solution {
    fun solution(num_list: IntArray): IntArray {
        val even = mutableListOf<Int>()
        val odd = mutableListOf<Int>()

        for (i in num_list) {
            if (i % 2 == 0) {
                even.add(i)
            } else {
                odd.add(i)
            }
        }
        return intArrayOf(even.size, odd.size)
    }
}