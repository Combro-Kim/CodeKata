class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var arrK = mutableListOf<Int>() //k 순위

        for (i in score) {

            if (arrK.size < k) { //k만큼 arr에 집어넣기
                arrK.add(i)
            } else if (arrK[0] < i) {
                arrK[0] = i
            }
            arrK.sort()
            answer += arrK[0]
        }
        return answer
    }
}