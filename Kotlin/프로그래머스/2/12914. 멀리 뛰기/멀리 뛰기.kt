class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        
        var prev = 1L
        var current = 2L
        
        if(n == 1) {
            return prev
        } else if (n == 2) {
            return current
        } else {
            for(i in 3..n) {
                answer = (prev + current)%1234567L
                prev = current
                current = answer
            } 
        }
        
        
        return answer
    }
}