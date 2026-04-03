import kotlin.math.min
class Solution {
    fun solution(s: String): Int {
        var answer = 0
        answer = s.length
        if(answer == 1 ){
            return answer
        }
        for(step in 1..s.length/2) {
            val compressed = StringBuilder()
            var prev = s.substring(0, step)
            var count = 1
            for(j in step until s.length step step) {
                val end = (j+step).coerceAtMost(s.length)
                val current = s.substring(j, end)
                if (prev == current) {
                    count++
                } else {
                    if (count >= 2) compressed.append(count)
                    compressed.append(prev)
                    prev = current
                    count = 1
                }
            }
            if (count >= 2) compressed.append(count)
            compressed.append(prev)
            answer = min(answer, compressed.length)
        }
        return answer
    }
}