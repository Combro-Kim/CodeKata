class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var lux = 51
        var luy = 51
        var rdx = 0
        var rdy = 0

        for (i in wallpaper.indices) {
            var eachLine = wallpaper[i]
            eachLine.toCharArray().forEachIndexed { idx, value ->
                if (value == '#') {
                    lux = min(lux, idx)
                    luy = min(luy, i)
                    rdx = max(rdx, idx)
                    rdy = max(rdy, i)
                }
            }
        }
        return intArrayOf(luy, lux, rdy + 1, rdx + 1)
    }

    fun min(a: Int, b: Int): Int {
        var result = 51
        if (a <= b){
            result = a
        }else {
            result = b
        }
        return result
    }

    fun max(a: Int, b: Int): Int {
        var result = 0
        if (a >= b) {
            result = a
        }else{
            result = b
        }
        return result
    }
}