class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var start = 0
        var end = 0
        var sum = 0
        var minLength = Int.MAX_VALUE
        
        while(end < sequence.size) {
            sum += sequence[end]
            
            while(sum > k && start <= end) {
                sum -= sequence[start]
                start++
            }
            if(k == sum) {
                var length = end - start
                if(length < minLength) {
                    minLength = length
                    answer = intArrayOf(start, end)
                }
            }
            end++
            
        }
        
        return answer
    }
}