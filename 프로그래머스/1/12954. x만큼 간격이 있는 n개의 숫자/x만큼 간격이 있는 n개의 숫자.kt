class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var arr = mutableListOf<Long>(x.toLong())

        for(i in 0 until n-1){
            arr.add(arr[i]+x)
        }

        return arr.toLongArray()
    }
}