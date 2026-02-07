class Solution {
    fun solution(t: String, p: String) = (0..(t.length - p.length)).map{
        t.substring(it,it+p.length).toLong()}.count{a-> a<= p.toLong()}
    
}