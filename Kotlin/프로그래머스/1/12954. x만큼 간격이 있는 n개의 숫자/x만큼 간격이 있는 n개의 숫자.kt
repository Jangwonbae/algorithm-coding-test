class Solution {
    fun solution(x: Int, n: Int): LongArray = (1..n).toList().map{it -> it.toLong()*x}.toLongArray()
}