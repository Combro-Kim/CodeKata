class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = mutableMapOf<String, Int>()
        id_list.forEach { answer[it] = 0 }

        //신고된 횟수
        val userMap = mutableMapOf<String, Int>()
        report.distinct().forEach {
            val reported = it.split(' ')[1]
            userMap[reported] = userMap.getOrDefault(reported, 0) + 1
        }

        //정지당한 유저(userMap.value >= k)
        val stopList = mutableListOf<String>()
        userMap.forEach {
            if (it.value >= k) {
                stopList += it.key
            }
        }

        //정지된 유저를 신고한 사람 (stopCntList에 있는 사람을 신고한 사람)
        report.distinct().forEach {
            val user = it.split(' ')[0]
            val reportedUser = it.split(' ')[1]
            if (stopList.contains(reportedUser)) {
                answer[user] = answer.getOrDefault(user,0) + 1
            }
        }
        return answer.values.toIntArray()
    }
}