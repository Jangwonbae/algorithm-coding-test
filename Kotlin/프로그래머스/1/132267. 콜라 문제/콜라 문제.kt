class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        if(n<a) return 0
        return b*(n/a) + solution(a,b,b*(n/a)+n%a)
    }
}