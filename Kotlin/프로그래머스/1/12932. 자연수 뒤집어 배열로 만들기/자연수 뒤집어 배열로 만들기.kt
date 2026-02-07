class Solution {
    fun solution(n: Long): IntArray = n.toString().map{it-'0'}.reversed().toIntArray()
}