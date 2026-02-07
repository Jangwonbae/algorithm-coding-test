class Solution {
    fun solution(n: Int): Int = (1..n).toList().filter{n%it==0}.sum()
}