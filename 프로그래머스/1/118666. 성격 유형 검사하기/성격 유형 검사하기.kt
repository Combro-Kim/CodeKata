class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val scoreArr = intArrayOf(3, 2, 1, 0, 1, 2, 3)
        var eachScore = mutableMapOf(
            //key-value로 각각을 받음
            "R" to 0, "T" to 0,
            "C" to 0, "F" to 0,
            "J" to 0, "M" to 0,
            "A" to 0, "N" to 0,
        )

        for (i in survey.indices) {
            val s = survey[i]
            val str = if (choices[i] < 4) s[0] else s[1]
            //2개로 나눠서 점수 부여
            if (choices[i] == 4) continue //4 (모르겠음) 이면 다시
//            if (choices[i] < 3) {
            eachScore[str.toString()] = eachScore.getOrDefault(str.toString(),0) + scoreArr[choices[i]-1]
        }
        answer += if(eachScore.getOrDefault("R",0) >= eachScore.getOrDefault("T",0)) "R" else "T"
        answer += if(eachScore.getOrDefault("C",0) >= eachScore.getOrDefault("F",0)) "C" else "F"
        answer += if(eachScore.getOrDefault("J",0) >= eachScore.getOrDefault("M",0)) "J" else "M"
        answer += if(eachScore.getOrDefault("A",0) >= eachScore.getOrDefault("N",0)) "A" else "N"

        return answer
    }
}