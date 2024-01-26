class Solution {
    fun solution(s: String): String {
        var answer = ""
        val s_len = s.length

        if (s_len % 2 == 0) {
            for (i in s_len / 2 - 1..s_len / 2) {
                answer += s[i]
            }
        } else {
            answer += s[s_len / 2]
        }

        return answer
    }
}