class Solution {
    fun solution(a: Int, b: Int): String {
        var m = intArrayOf(0,31,29,31,30,31,30,31,31,30,31,30,31)
        var day = arrayOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        return day[(m.slice(0..(a-1)).sum()+b-1)%7]
    }
}