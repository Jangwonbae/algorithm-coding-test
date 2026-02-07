class Solution {
    fun solution(rsp: String) = rsp.map{when(it.toString()) {
        "2" -> "0"
        "0" -> "5"
        "5" -> "2"
        else -> ""
    }}.joinToString("")
}