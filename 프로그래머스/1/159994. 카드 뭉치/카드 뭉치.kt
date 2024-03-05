class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i = 0
        var j = 0

        goal.forEach {
            if(i < cards1.size && cards1[i] == it) i++
            else if (j < cards2.size && cards2[j] == it) j++
            else return "No"
        }


        return "Yes"
    }
}