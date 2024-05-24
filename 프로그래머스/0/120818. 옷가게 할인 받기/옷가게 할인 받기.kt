class Solution {
    fun solution(price: Int) = when {
        price >= 500_000 -> (price * 0.8).toInt()
        price >= 300_000 -> (price * 0.9).toInt()
        price >= 100_000 -> (price * 0.95).toInt()
        else -> price
    }
}