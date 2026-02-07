class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(s in my_string) {
            for(i in 1..n)  {
                answer+=s
            }
        }
        return answer
    }
}