class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var lostList = (lost.sorted() - reserve.sorted()).toMutableList()
        var reserveList = (reserve.sorted() - lost.sorted()).toMutableList()

        for (i in reserveList) {
            if (lostList.contains(i - 1)) {
                lostList.remove(i - 1)
            } else if (lostList.contains(i + 1)) {
                lostList.remove(i + 1)
            }
        }
        
        return n - lostList.size
    }
}