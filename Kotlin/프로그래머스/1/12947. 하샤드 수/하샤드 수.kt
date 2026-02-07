class Solution {
    fun solution(x: Int): Boolean = if(x%x.toString().sumOf { it - '0' }==0) true else false
}