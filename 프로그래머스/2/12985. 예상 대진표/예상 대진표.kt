class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var a = a ;var b = b

        while (a != b) {
            a -= a/2
            b -= b/2
            answer++
        }
        return answer
    }
}