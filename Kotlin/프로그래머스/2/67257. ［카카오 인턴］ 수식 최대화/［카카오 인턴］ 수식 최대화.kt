import kotlin.math.abs
class Solution {
    fun solution(expression: String): Long {
        var answer: Long = 0
        var numbers = expression.split("*","+","-").map { it.toLong() }.toMutableList()
        var ops = expression.filter{it == '*' || it == '+' || it == '-'}.toMutableList()
        
        val priorites = listOf(
            listOf('*', '+', '-'), listOf('*', '-', '+'),
            listOf('+', '*', '-'), listOf('+', '-', '*'),
            listOf('-', '*', '+'), listOf('-', '+', '*')
        )
        for(priority in priorites) {
            val subNumbers = numbers.toMutableList()
            val subOps = ops.toMutableList()
            for (currentOp in priority) {
                var i = 0
                while (i < subOps.size) {
                    if (subOps[i] == currentOp) {
                        // 연산 수행
                        val res = calc(subNumbers[i], subNumbers[i + 1], subOps[i])
                        // 숫자 리스트 갱신: i번째와 i+1번째를 결과로 대체
                        subNumbers[i] = res
                        subNumbers.removeAt(i + 1)
                        // 연산자 리스트 갱신: 사용한 연산자 제거
                        subOps.removeAt(i)
                        // 리스트가 줄어들었으므로 인덱스 유지
                        i--
                    }
                    i++
                }
            }
            answer = maxOf(answer, abs(subNumbers[0]))
        }
        
        return answer
    }
    fun calc(a: Long, b: Long, op: Char) : Long {
        return when(op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            else -> 0L
        }
    }
}