class Solution {
    fun solution(numbers: IntArray): Int {
        var firstMax: Int = 0
        var secMax : Int = 0
        for(n in numbers) {
            if(n > firstMax) {
                if(firstMax > secMax) {
                    secMax = firstMax
                }
                firstMax = n
            } else {
                if(n > secMax) {
                    secMax = n
                }
            }
        }
        return firstMax*secMax
    }
}