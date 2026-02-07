class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var lastDollIndex = Array(board[0].size) {-1}
        var pickedDolls = mutableListOf<Int>()
        for(i in 0..board.lastIndex) {
            for(j in 0..board[i].lastIndex) {
                if(board[i][j] != 0 && lastDollIndex[j] == -1) {
                    lastDollIndex[j] = i
                }
            }
        }
        moves.forEach{
            if(lastDollIndex[it-1] != -1 && lastDollIndex[it-1] < board.size) {
                pickedDolls.add(board[lastDollIndex[it-1]][it-1])
                lastDollIndex[it-1] +=1
                if(pickedDolls.size > 1 && pickedDolls[pickedDolls.lastIndex] 
                   == pickedDolls[pickedDolls.lastIndex-1]) {
                    pickedDolls.removeAt(pickedDolls.lastIndex)
                    pickedDolls.removeAt(pickedDolls.lastIndex)
                    answer+=2
                    } 
                }
            }
        return answer
    }
}