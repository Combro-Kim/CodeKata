class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val regex = "aya|ye|woo|ma".toRegex()
        val regexX = "ayaaya|yeye|woowoo|mama".toRegex()
        
        answer = babbling.map { it.replace(regexX,"*") }.map { it.replace(regex,"") }.count{it==""}

        return answer
    }
}