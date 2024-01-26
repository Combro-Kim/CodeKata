class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        val nSize = phone_number.length - 4
        var cnt = 0

        for (i in 0 until phone_number.length) {
            if (i < nSize) {
                answer += '*'
            } else {
                answer += phone_number[i]
            }
        }

        return answer
    }
}