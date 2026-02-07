class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(s11 in s1) {
            for(s22 in s2) {
                if(s11.equals(s22)) {
                    answer++
                }
            }
        }
        return answer
    }
}