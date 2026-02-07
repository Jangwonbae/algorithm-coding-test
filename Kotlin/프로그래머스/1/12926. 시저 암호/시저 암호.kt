class Solution {
    fun solution(s: String, n: Int): String = s.map{
        if(it != ' ') {
            if(it>='a' && it<='z') {
                ('a' + (it - 'a' + n) % 26)
            } else {
                ('A' + (it - 'A' + n) % 26)
            }
        } else it
    }.joinToString("")
}