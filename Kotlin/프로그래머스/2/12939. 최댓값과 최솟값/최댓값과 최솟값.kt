class Solution {
    fun solution(s: String): String = s.split(" ").map{it.toInt()}.let{"${it.minOrNull()!!} ${it.maxOrNull()!!}"}
     
}