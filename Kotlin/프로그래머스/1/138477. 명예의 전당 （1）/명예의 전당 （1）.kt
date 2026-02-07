class Solution {
    fun solution(k: Int, score: IntArray): IntArray =score.mapIndexed{i, v -> 
        var arr = score.slice(0..i).sortedDescending()
        if(arr.size < k) arr[i] else arr[k-1]
        }.toIntArray()
}