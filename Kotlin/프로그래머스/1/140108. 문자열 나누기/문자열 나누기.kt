class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var same = 0
        var diff = 0
        var firstChar : Char? = null
        for(i in 0..s.lastIndex) {
            if(firstChar==null) {
                firstChar = s[i]
                same ++
            } else if(firstChar == s[i]) {
                same++
            } else {
                diff++
            }
            if(same==diff || i==s.lastIndex) {
                same=0
                diff=0
                firstChar=null
                answer++
            }
        }
        return answer
    } 
}