import kotlin.math.*
class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var sortedNumbers = numbers.sorted()
        var oneTwo = sortedNumbers[0]*sortedNumbers[1]
        var oneLast = sortedNumbers[0]*sortedNumbers[sortedNumbers.lastIndex]
        var lastlastTwo = sortedNumbers[sortedNumbers.lastIndex]*sortedNumbers[sortedNumbers.lastIndex-1]
        answer = max(lastlastTwo,max(oneTwo, oneLast))
        
        return answer
    }
}