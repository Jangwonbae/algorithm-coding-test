import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.ceil
import kotlin.math.floor
class Solution {
    fun solution(r1: Int, r2: Int): Long {
        var answer: Long = 0
        for(i in r1..r2) {
            answer++
        }
        answer = answer*4
        var inCircle = 0L
        for(x in 1 until r2) {
            var y1 = getHeight(r1, x)
            var y2 = getHeight(r2, x)
            
            val maxY = floor(y2).toLong()
            val minY = ceil(y1).toLong().coerceAtLeast(1L)

            if (maxY >= minY) {
                inCircle += (maxY - minY + 1)
            }
        }
        answer=answer+4*inCircle
        return answer
    }
    fun getHeight(r: Int, x: Int): Double {
        return sqrt(r.toDouble().pow(2)-x.toDouble().pow(2))
    } 
}