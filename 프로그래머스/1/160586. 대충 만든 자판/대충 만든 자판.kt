class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val keyValueMap = mutableMapOf<Char, Int>()

        //keyValueMap에 keymap을 정리 (key-value형식으로 몇번째가 제일 빠른지 저장
        //입출력 1번의 경우 {A=1, B=1, C=2, D=5, E=3, F=4}
        keymap.forEach { key ->
            key.forEachIndexed { j, value ->
                if (j < (keyValueMap[value] ?: 1000)) {
                    keyValueMap[value] = j + 1
                }
            }
        }
        //해당 값에 맞게 넣기
        targets.forEach { target ->
            var cnt = 0
            target.forEach { value ->
                cnt += keyValueMap[value] ?: 1000
            }
            answer.add(if (cnt < 1000) cnt else -1)
        }
        return answer.toIntArray()
    }
}