class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {

        var arr1 = mutableListOf<Int>()
        for (i in arr){
            if (i % divisor==0){
                arr1.add(i)
            }
        }
        if (arr1.size== 0){
            arr1.add(-1)
        }
        arr1.sort()

        return arr1.toIntArray()
    }
}