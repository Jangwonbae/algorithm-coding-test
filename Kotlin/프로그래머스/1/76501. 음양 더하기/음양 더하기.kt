class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int = absolutes.foldIndexed(0) {
        index, sum, value -> sum + when(signs[index]) {
            true -> value
            else -> -1*value
        }
    }
}