class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int 
        var dNum1 : Double = num1.toDouble()
        var dNum2 : Double = num2.toDouble()
        answer = (dNum1/dNum2 * 1000).toInt()
        return answer
    }
}