class Solution {
    fun solution(a: Int, b: Int): String {
        val monthList = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayList = listOf("THU","FRI", "SAT", "SUN", "MON", "TUE", "WED")

        var day = ((0 until a-1).map{ monthList[it] }.sum() + b ) % 7
        
        return dayList[day]
    }
}