class Solution {
    fun solution(elements: IntArray): Int {
        val answer = mutableSetOf<Int>()
        val elements2 = elements + elements //[7, 9, 1, 1, 4, 7, 9, 1, 1, 4]

        for (i in 1..elements.size) {
            for (j in elements.indices) {
                var sum = 0
                for(k in j until j + i){
                    sum += elements2[k]
                }
                answer.add(sum)
            }
        }
        return answer.size
    }
}