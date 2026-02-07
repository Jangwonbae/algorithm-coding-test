class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var playerIdxMap = hashMapOf<String, Int>()
        players.forEachIndexed{i,v -> playerIdxMap.put(v,i)}
        
        for(c in callings) {
            var tempIdx : Int = playerIdxMap.getValue(c)
            players[tempIdx] = players[tempIdx-1]
            players[tempIdx-1] = c
            
            playerIdxMap.put(c, tempIdx-1)
            playerIdxMap.put(players[tempIdx], tempIdx)
        }
        
        return players
    }
}