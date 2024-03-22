class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val arr = listOf(1, 2, 3, 1)
        val muList = mutableListOf<Int>()

        for(i in ingredient){
            muList.add(i)
            if( muList.size >=4 && muList.slice(muList.size-4 until muList.size)==arr){
                repeat(4) { muList.removeLast()}
                answer++
            }
        }
        return answer
    }
}