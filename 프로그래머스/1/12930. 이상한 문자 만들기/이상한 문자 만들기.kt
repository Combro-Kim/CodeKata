class Solution {
    fun solution(s: String): String =
        s.split(" ").joinToString(" ") {
            it.mapIndexed { index, c ->
                if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
            }.joinToString ("")
        }
}