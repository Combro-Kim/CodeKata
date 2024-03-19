class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var eachTerms = mutableMapOf<String, Int>()
        val dayOfMonth = 28
        //today 총 요일
        var todaySum = today.split(".")[0].toInt() * 12 * dayOfMonth +
                today.split(".")[1].toInt() * dayOfMonth +
                today.split(".")[2].toInt()

        terms.forEach {//Terms 총 요일 담기
            eachTerms.put(it[0].toString(), it.split(" ")[1].toInt() * dayOfMonth)
        }

        for (i in privacies.indices) {
            var priType = privacies[i].split(".")[2].split(" ")[1]
            var priSum = privacies[i].split(".")[0].toInt() * 12 * dayOfMonth +
                    privacies[i].split(".")[1].toInt() * dayOfMonth +
                    privacies[i].split(".")[2].split(" ")[0].toInt()

            if (todaySum - priSum >= eachTerms[priType]!!) {
                answer += i + 1
            }
        }
        return answer
    }
}