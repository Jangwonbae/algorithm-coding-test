class Solution {
    fun solution(citations: IntArray): Int {
        val sorted = citations.sortedDescending()
        
        for(i in sorted.indices) {
             if (sorted[i] < i + 1) {
                return i
            }
        }
        return sorted.size
    }//6 5 3 1 0
}