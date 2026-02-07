class Solution {
    fun solution(a: IntArray, b: IntArray): Int = a.foldIndexed(0) {
        i, s, v -> s+v*b[i]
    }
}