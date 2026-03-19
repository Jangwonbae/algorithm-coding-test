class Solution {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        var answer: Int = 0
        var servers = IntArray(24)
        
        for(i in 0..players.lastIndex) {
            if(players[i]/m > servers[i]) {
                var needServerCnt = players[i]/m - servers[i]
                answer+=needServerCnt
                for(j in 0 until k) {
                    if(i+j <= players.lastIndex) {
                        servers[i+j] += needServerCnt
                    }
                }
            }
        }
        return answer
    }
}