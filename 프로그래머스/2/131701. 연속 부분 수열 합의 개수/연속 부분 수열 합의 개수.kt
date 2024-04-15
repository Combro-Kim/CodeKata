class Solution {
    fun solution(elements: IntArray): Int {
        val answer = mutableSetOf<Int>()
        val elements2 = elements + elements

        for(i in 1 .. elements.size){
            for(j in elements.indices){
                var sum = 0
                for(k in j until i+j){
                    sum += elements2[k]
                }
                answer.add(sum)
            }
        }
        return answer.size
    }
}