class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(0, 0)

        // 시작위치
        park.forEachIndexed { i, s ->
            s.forEachIndexed { j, _ ->
                if (park[i][j] == 'S') {
                    answer = intArrayOf(i, j)
                }
            }
        }

        val direction = hashMapOf<String, IntArray>(
            "E" to intArrayOf(0, 1),
            "W" to intArrayOf(0, -1),
            "S" to intArrayOf(1, 0),
            "N" to intArrayOf(-1, 0)
        )

        routes.forEach { str ->
            //방향, 이동횟수 저장
            val way = direction[str.split(" ")[0]] //E
            val cnt = str.split(" ")[1].toInt() //2
            var x = answer[0]
            var y = answer[1]

            for (j in 1..cnt) {
                x += way?.get(0) ?: 0
                y += way?.get(1) ?: 0

                if (x < 0 || y < 0 || x >= park.size || y >= park[0].length || park[x][y] == 'X') {
                    x = answer[0]
                    y = answer[1]
                    break
                }
            }
            answer[0] = x
            answer[1] = y
        }
        return answer
    }
}