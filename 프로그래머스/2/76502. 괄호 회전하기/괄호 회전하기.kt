class Solution {
    fun solution(s: String): Int {
        var count = 0
        for (i in 0 until s.length) {
            val rotatedString = s.substring(i) + s.substring(0, i)
            if (isValid(rotatedString)) count++
        }
        return count
    }

    private fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.add(char)
                ')' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '(') return false
                ']' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '[') return false
                '}' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '{') return false
            }
        }
        return stack.isEmpty()
    }
}