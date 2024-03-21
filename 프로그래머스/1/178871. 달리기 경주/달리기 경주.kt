class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val rankList = mutableMapOf<String, Int>()

        players.forEachIndexed { idx, player ->
            rankList[player] = idx
        }

        callings.forEachIndexed { idx, player ->
            val callPlayer = rankList[player] ?: 0
            val frontPlayer = players[callPlayer -1]
            
            players[callPlayer -1] = player
            players[callPlayer] = frontPlayer
            
            rankList[player] = callPlayer -1
            rankList[frontPlayer] = callPlayer
        }
        return players
    }
}