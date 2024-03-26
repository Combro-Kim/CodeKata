class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answerMap = mutableMapOf<String, Int>()
        id_list.forEach {
            answerMap[it] = 0
        }
        val userMap = mutableMapOf<String, Int>()

        // 신고된 횟수 저장, 중복제거 필요
        report.distinct().forEach {
            val reported = it.split(" ")[1]
            userMap[reported] = userMap.getOrDefault(reported, 0) + 1
        }

        //정지당한 횟수
        val stopList = mutableListOf<String>()
        userMap.forEach {
            if (it.value >= k) {
                stopList += it.key
            }
        }

        //stopList에서 신고한 사람 찾기
        report.distinct().forEach {
            val user = it.split(' ')[0]
            if (stopList.contains(it.split(' ')[1])) {
                answerMap[user] = answerMap.getOrDefault(user, 0) + 1
            }
        }
        return answerMap.values.toIntArray()
    }
}