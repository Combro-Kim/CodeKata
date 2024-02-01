class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        for (i in 0 until t.length - p.length + 1) {
            var subString = t.substring(i, p.length + i)

            if (p >= subString) {
                answer += 1
            }
        }
        return answer
    }
}