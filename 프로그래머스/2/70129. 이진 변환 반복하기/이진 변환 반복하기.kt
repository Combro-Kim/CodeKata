class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(2)
        var str = s

        while (str.length != 1) {
            //횟수 추가
            //0 개수 더하기
            //0 제거
            //2진법으로 바꾸기
            answer[0]++
            answer[1] += str.count { it == '0' }
            str = str.replace("0", "")
            str = Integer.toBinaryString(str.length)
        }
        return answer
    }
}