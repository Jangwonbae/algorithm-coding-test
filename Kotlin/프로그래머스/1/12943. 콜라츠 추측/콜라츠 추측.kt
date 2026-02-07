class Solution {
    fun solution(num: Int): Int {
        var answer : Long = num.toLong()
        var count = 0
        
        while(count < 500 && answer!=1L) {
            if(answer%2==0L) answer = answer/2 else answer = 3*answer+1
            count++
        }
        if(count == 500) return -1
        return count
    }
}