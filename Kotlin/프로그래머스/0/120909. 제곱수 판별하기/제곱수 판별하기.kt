import kotlin.math.*
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var sqrt = sqrt(n.toDouble())
        if(sqrt%1 == 0.0) answer = 1 else answer = 2
        return answer
    }
}