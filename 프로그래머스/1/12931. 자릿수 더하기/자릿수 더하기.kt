class Solution {
    fun solution(n: Int): Int {
        var result = 0
        for (n_string in n.toString()){
            result += n_string.toString().toInt()
        }
        return result
    }
}