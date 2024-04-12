class Solution {
    fun isCorrect(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val brackets = mapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in s) {
            if (brackets.containsKey(char)) {
                if (stack.isEmpty() || stack.last() != brackets[char]) {
                    return false
                }
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(char)
            }
        }
        return stack.isEmpty()
    }

    fun solution(s: String): Int {
        var answer = 0
        val rotatedS = s.toMutableList()

        for (i in 0 until s.length) {
            rotatedS.add(rotatedS.removeAt(0))
            if (isCorrect(rotatedS.joinToString(""))) {
                answer++
            }
        }

        return answer
    }
}