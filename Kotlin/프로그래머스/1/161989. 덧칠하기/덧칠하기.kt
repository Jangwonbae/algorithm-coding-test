class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var paint = 0
        section.forEach{
            it -> if(it > paint) {
                paint = it+m-1
                answer++
                
            } 
        }
        return answer
    }
}