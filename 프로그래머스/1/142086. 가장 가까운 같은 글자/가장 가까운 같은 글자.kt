class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var arr = mutableListOf<Char>()

        for (i in s) {
            if (arr.contains(i)) {
                for (j in arr.size - 1 downTo 0) {

                    if (i == arr[j]) {
                        answer += arr.size - j
                        break
                    }
                }

            } else {
                answer += -1
            }
            arr.add(i)
        }

        return answer
    }
}