class Solution {
    var answer = 0
    private lateinit var cols: IntArray
    fun solution(n: Int): Int {
        cols = IntArray(n)
        backtrack(0, n)
        
        return answer
    }
    fun backtrack(row: Int, n: Int) {
        if(row == n) {
            answer++
            return
        }
        for(col in 0 until n) {
            if(isSafe(row, col)) {
                cols[row] = col
                backtrack(row + 1, n)
            }
        }
    }
    fun isSafe(row: Int, col: Int): Boolean {
        for (i in 0 until row) {
            // 1. 같은 열 확인: cols[i] == col
            // 2. 대각선 확인: 행의 차이 == 열의 차이
            val colDiff = Math.abs(col - cols[i])
            val rowDiff = row - i
            if (cols[i] == col || colDiff == rowDiff) {
                return false
            }
        }
        return true
    }
}