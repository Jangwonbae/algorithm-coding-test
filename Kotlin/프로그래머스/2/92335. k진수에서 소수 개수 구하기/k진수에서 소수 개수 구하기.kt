import kotlin.math.*
class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var numbers = n.toString(k).split("0")
        numbers.forEach{
            if(it.isNotEmpty()) {
                var numberL = it.toLong()
                if(isPrime(numberL)) {
                    answer++
                }
            }
        }
        return answer
    }
    fun isPrime(number: Long): Boolean {
        if (number < 2) return false
        
        // 2. 제곱근까지만 확인하여 시간 복잡도 개선
        val end = sqrt(number.toDouble()).toLong()
        for (i in 2..end) {
            if (number % i == 0L) return false
        }
        return true
    }
}