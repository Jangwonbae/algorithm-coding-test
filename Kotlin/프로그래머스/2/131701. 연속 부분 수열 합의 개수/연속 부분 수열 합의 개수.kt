class Solution {
    fun solution(elements: IntArray): Int {
        var elementSumSet = mutableSetOf<Int>()
        var elementselements = elements+elements
        
        for(i in 0..elements.lastIndex) {
            for(j in 0..elements.lastIndex) {
                var sum = elementselements.slice(j..j+i).sum()
                elementSumSet.add(sum)
            }
        }
        
        return elementSumSet.size
    }
} 
