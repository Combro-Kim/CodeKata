class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n) {i ->
            x.toLong() * (i+1).toLong()
        }
        return answer
    }
}