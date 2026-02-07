class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int = score.sortedDescending().foldIndexed(0){
            i, a, v -> if(i%m == m-1) a+v*m else a+0
        }
}