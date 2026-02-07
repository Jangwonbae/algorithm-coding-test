import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(i in 1..number) {
            var cnt = 0
            var iSqrt = sqrt(i.toDouble())
            for(j in 1..iSqrt.toInt()) {
                if(i%j==0) {
                    cnt++
                    
                }
            }
            if(iSqrt-iSqrt.toInt()==0.0) {
                cnt = 2*cnt-1
            } else {cnt = 2*cnt}
            if(cnt > limit) {
                cnt = power
            }
            answer+=cnt
            
        }
        return answer
    }
}