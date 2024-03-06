class Solution {
    fun solution(X: String, Y: String): String {
        var answer = StringBuilder()
        val arrX = IntArray(10)
        val arrY = IntArray(10)
        countArr(X, arrX)
        countArr(Y, arrY)

        for (i in arrX.indices.reversed()) {
            while (arrX[i] > 0 && arrY[i] > 0) {
                arrX[i]--
                arrY[i]--
                answer.append(i)
            }
        }
        if(answer.toString() ==""){
            return "-1"
        }else if (answer.startsWith("0")){
            return "0"
        }else{
            return answer.toString()
        }
    }

    private fun countArr(str: String, arr: IntArray) {
        for (i in str) {
            arr[i.toString().toInt()]++
        }
    }
}