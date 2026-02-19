class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        
        val n = arr1.size           // arr1 행
        val m = arr1[0].size        // arr1 열 = arr2 행
        val k = arr2[0].size        // arr2 열
        
        val answer = Array(n) { IntArray(k) }
        
        for (i in 0 until n) {
            for (j in 0 until k) {
                for (x in 0 until m) {
                    answer[i][j] += arr1[i][x] * arr2[x][j]
                }
            }
        }
        
        return answer
    }
}
