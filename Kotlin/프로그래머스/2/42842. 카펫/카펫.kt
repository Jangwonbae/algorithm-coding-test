class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        for(i in yellow downTo 1) {
            if(yellow%i == 0) {
                if((i+2)*(yellow/i+2) == brown+yellow) {
                    answer += (i+2)
                    answer += (yellow/i +2)
                    break
                }
            }
        }
        return answer
    }
}