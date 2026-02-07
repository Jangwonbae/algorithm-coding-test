class Solution {
    fun solution(arr: IntArray): IntArray = if(arr.size == 1) intArrayOf(-1) else {
        var min = arr.minOrNull()!!
        arr.filter{it != min}.toIntArray()
    }
}