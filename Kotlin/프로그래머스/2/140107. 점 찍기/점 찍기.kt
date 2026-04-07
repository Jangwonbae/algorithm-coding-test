import kotlin.math.sqrt

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        val dLimit = d.toLong() 
        
        for (x in 0..d step k) {
            val xLong = x.toLong()
            val maxY = sqrt((dLimit * dLimit - xLong * xLong).toDouble()).toLong()
            answer += (maxY / k) + 1
        }
        
        return answer
    }
}