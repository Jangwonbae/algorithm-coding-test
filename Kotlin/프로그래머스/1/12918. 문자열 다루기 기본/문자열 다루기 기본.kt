class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        try{
            if(s.length != 4 && s.length != 6) answer = false
            s.toInt()
        }catch (e :NumberFormatException) {
            answer = false
        }
        return answer
    }
}