class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var alphabat: String = "abcdefghijklmnopqrstuvwxyz"
        skip.forEach{
            alphabat = alphabat.replace(it.toString(), "")
        }
        return s.map { ch ->
            val i = alphabat.indexOf(ch)
            alphabat[(i + index) % alphabat.length]
        }.joinToString("")
    }
}