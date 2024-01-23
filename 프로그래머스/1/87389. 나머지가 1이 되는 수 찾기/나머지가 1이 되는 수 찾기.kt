class Solution {
    fun solution(n: Int): Int {
        var cnt = 1
        while (true){
            if (n%cnt == 1)
                return cnt
            else
                cnt += 1
            
        }
    }
}