class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var x_1 = x
        
        while(x_1 != 0){
            sum += x_1 % 10
            x_1 /= 10
        }
        return (x % sum == 0)
    }
}