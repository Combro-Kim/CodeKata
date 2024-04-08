class Solution {
    fun solution(n: Int): Long {
        var answer = LongArray(n+1)
        answer[0] = 1; answer[1] = 1

        if (n == 1) return 1
        

        for (i in 2..n) {
            answer[i] += (answer[i - 1] + answer[i - 2]) % 1234567
        }

        return answer[n]
    }
}