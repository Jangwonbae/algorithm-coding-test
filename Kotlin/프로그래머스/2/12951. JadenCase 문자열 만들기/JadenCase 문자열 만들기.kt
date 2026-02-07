class Solution {
    fun solution(s: String): String = s.split(" ").map{
        s -> s.mapIndexed{
            index, ch -> 
            if(index==0) ch.toUpperCase() else ch.toLowerCase()
        }.joinToString("")
    }.joinToString(" ")
}