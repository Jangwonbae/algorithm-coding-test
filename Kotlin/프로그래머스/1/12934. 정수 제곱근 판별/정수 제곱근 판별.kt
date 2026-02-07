import kotlin.math.*
class Solution {
    fun solution(n: Long): Long = sqrt(n.toDouble()).toLong().let{
        if(it*it==n) {
            (it+1).toDouble().pow(2).toLong()
        } else {
            -1
        }
    }
}