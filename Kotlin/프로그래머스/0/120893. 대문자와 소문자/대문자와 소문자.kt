class Solution {
    fun solution(my_string: String) = my_string.map{
        when {
            it in 'a'..'z' -> (it-32)
            it in 'A'..'Z' -> (it+32)
            else -> it
        }
    }.joinToString("")
}