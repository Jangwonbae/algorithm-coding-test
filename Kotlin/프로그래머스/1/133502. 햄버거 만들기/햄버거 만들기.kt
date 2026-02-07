class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer = 0
        var stack = mutableListOf<Int>()
        for(i in 0..ingredient.lastIndex) {
            stack.add(ingredient[i])
            if(stack.size>=4) {
                if(stack.takeLast(4) == listOf(1,2,3,1)) {
                    repeat(4) { stack.removeAt(stack.lastIndex)}
                    answer++
                }
                
            }
        }
        return answer
    }
}