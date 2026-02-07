class Solution {
    fun solution(a: Int, b: Int) = if((a.toString()+b.toString()).toInt() > 2*a*b) (a.toString()+b.toString()).toInt() else 2*a*b
}