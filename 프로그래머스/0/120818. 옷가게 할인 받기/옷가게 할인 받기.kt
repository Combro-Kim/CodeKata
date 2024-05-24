class Solution {
    fun solution(price: Int): Int {
        var result = price.toDouble()
        if (price >= 500000) {
            result -= price * 0.2
        } else if (price >= 300000) {
            result -= price * 0.1
        } else if (price >= 100000) {
            result -= price * 0.05
        }
        return result.toInt()
    }
}