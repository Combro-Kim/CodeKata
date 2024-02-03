class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for (i in commands.indices){
            var arr = array.slice(commands[i][0]-1..commands[i][1]-1)
            arr = arr.sorted()
            answer += arr[commands[i][2]-1]

        }

        return answer
    }
}