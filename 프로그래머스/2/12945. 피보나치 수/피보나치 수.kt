class Solution {
    fun solution(n: Int): Int {
        var answer = Array<Int>(3){1}
        if(n==2) return 1
        for(i in 1..n-2){
            answer[2] = (answer[0]+answer[1])%1234567
            answer[0] = answer[1]
            answer[1] = answer[2]
        }

        return answer[2]
    }
}