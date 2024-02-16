class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var regex = "aya|ye|woo|ma".toRegex()
        var regexC = "ayaaya|yeye|woowoo|mama".toRegex()
        
        answer = babbling.map { it.replace(regexC,"*") }.map { it.replace(regex,"") }.count { it=="" }
        
        return answer
    }
}