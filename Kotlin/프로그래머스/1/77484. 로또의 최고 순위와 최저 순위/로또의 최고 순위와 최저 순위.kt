class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val zeroCount = lottos.count { it == 0 }
        val matchCount = lottos.count { it != 0 && it in win_nums }
        
        return intArrayOf(rank(matchCount+zeroCount),rank(matchCount))
    }
    fun rank(ok : Int) : Int {
        return when {
            ok >= 6 -> 1
            ok == 5 -> 2
            ok == 4 -> 3
            ok == 3 -> 4
            ok == 2 -> 5
            else -> 6
        }
    }
}