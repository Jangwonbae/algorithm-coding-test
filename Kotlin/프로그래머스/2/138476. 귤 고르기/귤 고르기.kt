class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var g = k
        tangerine.distinct().map{
            it -> tangerine.filter{v -> v == it}.count()
        }.sortedDescending().forEach{
             g = g - it
            answer++
            if(g<=0) return answer
        }
        
        return answer
    } 
}