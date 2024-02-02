class Solution {
    fun solution(s: String): Int {
        val enNum =
            arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var str = s
        for (i in enNum.indices) {
            str = str.replace(enNum[i], i.toString())
        }
        return str.toInt()
    }
}