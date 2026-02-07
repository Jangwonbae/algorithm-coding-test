class Solution {
    fun solution(my_string: String): IntArray = my_string.filter{ it >= '0' && it<='9'}.map{it-'0'}.sorted().toIntArray()
}