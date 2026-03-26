import java.util.*
class Solution {
    fun solution(n: Int, k: Int, enemys: IntArray): Int {
        var answer: Int = 0
        var mySol = n
        var m = k
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        for(e in enemys) {
            mySol-=e
            pq.add(e)
            
            if(mySol < 0) {
                if(m > 0) {
                    mySol += pq.poll()
                    m--
                } else {
                    break
                }
            }
            answer++
        }
        return answer
    }
}