class Solution {
    fun solution(weights: IntArray): Long {
        var answer: Long = 0
        
        var countMap = LongArray(1001)
        
        for(w in weights) {
            countMap[w]++
        }
        
        for(i in 100..1000) {
            if (countMap[i] == 0L) continue
            
            if(countMap[i] > 1) {
                answer+= countMap[i]*(countMap[i]-1)/2
            }
            
            if(i * 3 % 2 == 0) {
                val partner = i * 3 / 2
                if(partner <= 1000) {
                    answer+= countMap[i] * countMap[partner]
                }
            }
            
            if(i * 2 <= 1000) {
                answer += countMap[i] * countMap[i * 2]
            }
            
            if (i * 4 % 3 == 0) {
                val partner = i * 4 / 3
                if (partner <= 1000) {
                    answer += countMap[i] * countMap[partner]
                }
            }
        }
        return answer
    }
}