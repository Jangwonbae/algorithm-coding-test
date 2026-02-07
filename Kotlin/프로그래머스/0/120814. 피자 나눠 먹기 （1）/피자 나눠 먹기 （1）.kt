class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        when(n%7 > 0) {
            true -> answer = n/7+1
            false -> answer = n/7
        }
        return answer
    }
}