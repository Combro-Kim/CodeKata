class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""

        s.map {
            var cnt = index
            var str = it

            while (cnt > 0) {
                str++
                if (str > 'z') str = 'a'
                if (!skip.contains(str)) cnt--
            }
            answer += str
        }
        return answer
    }
}