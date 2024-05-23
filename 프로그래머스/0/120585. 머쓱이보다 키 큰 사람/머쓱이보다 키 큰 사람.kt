class Solution {
    fun solution(array: IntArray, height: Int): Int {
        return array.count{height<it}
    }
}