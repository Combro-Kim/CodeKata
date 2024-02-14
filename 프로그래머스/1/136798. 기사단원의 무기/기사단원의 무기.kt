class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        for (i in 1..number) {
            var sq = sqrt(i)

            if (sq > limit) answer += power else answer += sq
        }
        return answer
    }

    private fun sqrt(number: Int): Int {
        if (number == 1) return 1
        else if (number == 2 || number == 3) return 2

        var cnt = 0
        val x = Math.sqrt(number.toDouble()).toInt()

        for (i in 1..x) {
            if (i * i == number) cnt++
            else if (number % i == 0) cnt += 2
        }
        return cnt

    }
}
