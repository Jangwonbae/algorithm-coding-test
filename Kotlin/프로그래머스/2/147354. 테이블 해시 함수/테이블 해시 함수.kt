class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var answer: Int = 0
        var sortedDataByCol = data.sortedWith(
            compareBy<IntArray> { it[col-1] }.thenByDescending { it[0] }
        )
        for(i in row_begin..row_end) {
            var row = i-1
            var s_i = 0
            for(j in 0..sortedDataByCol[0].lastIndex) {
                s_i+=getRemainder(sortedDataByCol[row][j], i)
            }
            answer = answer xor s_i
        }
        return answer
    }
    fun getRemainder(dividend: Int, divisor: Int): Int {
        return dividend%divisor
    }
}