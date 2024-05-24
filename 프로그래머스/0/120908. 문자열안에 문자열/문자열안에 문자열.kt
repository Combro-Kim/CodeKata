class Solution {
    fun solution(str1: String, str2: String): Int {
        var result = 2
        if(str1.contains(str2)){
            result =1
        }
        return result
    }
}