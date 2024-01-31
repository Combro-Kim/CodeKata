class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        answer += gcd(n,m)
        answer += lcm(n,m)
        return answer
    }

    fun gcd(n: Int, m: Int): Int {
        return if (m != 0) gcd(m, n % m) else n
    }

    fun lcm(n: Int, m: Int): Int {
        return n * m / gcd(n, m)
    }
}