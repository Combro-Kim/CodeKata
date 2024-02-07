class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var n = n
        var left = 0

        while (n >= a) {
            left = n / a * b
            answer += left
            n = n % a + left
        }
        return answer
    }
}