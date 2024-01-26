class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        val nSize = phone_number.length - 4
        var cnt = 0

        for (i in 0 until nSize) {
            answer += '*'
        }
        for (i in nSize until nSize + 4) {
            answer += phone_number[i]
        }
        return answer
    }
}