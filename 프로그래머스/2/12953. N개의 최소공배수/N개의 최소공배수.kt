class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]

        for(i in 1 until arr.size){
            answer = lcm(answer,arr[i])
        }

        return answer
    }

    //최대공약수
    fun gcd(n: Int, m: Int): Int {
        return if (m != 0) gcd(m, n % m) else n
    }

    //최소공배수
    fun lcm(n: Int, m: Int): Int {
        return n * m / gcd(n, m)
    }
}