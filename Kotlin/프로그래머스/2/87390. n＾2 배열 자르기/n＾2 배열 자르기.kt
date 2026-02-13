class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray = (left..right).toList().map{
        var row = it/n +1
        var col = it%n +1
        maxOf(row,col).toInt()
    }.toIntArray()
}