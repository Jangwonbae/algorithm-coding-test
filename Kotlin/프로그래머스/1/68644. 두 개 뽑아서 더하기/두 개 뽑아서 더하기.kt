class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()
        for(i in 0..numbers.lastIndex) {
            if(i<numbers.lastIndex) {
                for(j in (i+1)..numbers.lastIndex) {
                    answer.add(numbers[i]+numbers[j])
                }
            }  
        }
        
        return answer.sorted().toIntArray()
    }
}