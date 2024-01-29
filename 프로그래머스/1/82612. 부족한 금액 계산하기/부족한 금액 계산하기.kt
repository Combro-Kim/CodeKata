class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var charge: Long = 0

        for (i in 1..count) {
            charge += price * i
        }
        
        return if (money > charge) 0 else charge - money
    }
}