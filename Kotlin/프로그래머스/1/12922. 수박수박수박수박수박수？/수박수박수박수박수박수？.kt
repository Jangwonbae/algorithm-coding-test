class Solution {
    fun solution(n: Int): String {
        var answer = StringBuilder()
        for(i in 1..(n/2)) {
            answer.append("수박")
        }
        if(n%2==1) answer.append("수")
        return answer.toString()
    }
}