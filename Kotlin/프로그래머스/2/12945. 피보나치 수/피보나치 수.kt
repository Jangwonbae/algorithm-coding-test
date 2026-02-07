class Solution {
    fun solution(n: Int): Int {
        var answer = mutableListOf<Int>() 
        answer+=0
        answer+=1
        for(i in 2..n) {
            answer+= (answer[i-2]+answer[i-1]) % 1234567
        }
        return answer[answer.lastIndex]
    }
}