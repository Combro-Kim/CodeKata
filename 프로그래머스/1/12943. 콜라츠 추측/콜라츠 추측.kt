class Solution {
    fun solution(num: Int): Int {
        var cnt = 0
        var n = num

        while (n!= 1){
            cnt += 1
            if (cnt == 500){
                return -1
            }
            if (n %2 == 0){
                n /=2
            }else{
                var temp = n.toDouble()
                temp = (temp * 3) + 1
                n = temp.toInt()
            }
        }
        return cnt
    }
}