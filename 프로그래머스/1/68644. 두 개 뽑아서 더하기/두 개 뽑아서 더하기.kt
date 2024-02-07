class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()

        for((index, value) in numbers.withIndex()) {
            for(i in index + 1 until numbers.size) {
                answer.add(value + numbers[i])
            }
        }
        return answer.sorted().toIntArray()
    }
}