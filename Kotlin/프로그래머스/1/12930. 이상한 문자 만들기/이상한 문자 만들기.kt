class Solution {
    fun solution(s: String): String = s.split(" ").map{it.mapIndexed{i,v -> if(i%2==0) v.toUpperCase() else v.toLowerCase()}.joinToString("")}.joinToString(" ")
}