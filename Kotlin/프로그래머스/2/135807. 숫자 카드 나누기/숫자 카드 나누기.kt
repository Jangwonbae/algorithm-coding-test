import kotlin.math.*
class Solution {
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        var answer: Int = 0
        //1번 케이스 A를 나눌 수 있고 B를 나눌 수 없는 경우
        var caseA = findAnswer(arrayA, arrayB)
        var caseB = findAnswer(arrayB, arrayA)
        
        return max(caseA, caseB)
    }
    fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = x % y
            x = y
            y = temp
        }
        return x
    }
    fun findAnswer(divisibleArr: IntArray, indivisibleArr: IntArray) : Int {
        var answer = 0
        if(divisibleArr.size == 1) {
            answer = divisibleArr[0]
        } else {
            var x = divisibleArr[0]
            for(i in 0..divisibleArr.lastIndex) {
                x = gcd(divisibleArr[i], x)
            }
            answer = x
        }
        for(i in 0..indivisibleArr.lastIndex) {
            if(indivisibleArr[i] % answer == 0) {
                answer = 0
                break
            }
        }
        return answer
        
    }
}