class Solution {
    fun solution(s: String): String {
        var answer = ""
        val str = s.split(' ')

        for (i in str) {
            answer += i.lowercase().replaceFirstChar { it.uppercase() }
            answer += ' '
        }

        return answer.dropLast(1)
    }
}