class Solution {
    fun solution(x: Int): Boolean {
        val x_arr = x.toString().toCharArray()
        var sum = 0

        for (i in x_arr){
            sum += i.toString().toInt()
        }

        return x % sum == 0
    }
}