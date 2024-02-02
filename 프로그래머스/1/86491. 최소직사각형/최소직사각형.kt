class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var x = 0
        var y = 0


        sizes.forEach {
            if (it[0] > it[1]) {
                if (x < it[0]) x = it[0]
                if (y < it[1]) y = it[1]
            } else {
                if (x < it[1]) x = it[1]
                if (y < it[0]) y = it[0]
            }
        }

        return x * y
    }
}