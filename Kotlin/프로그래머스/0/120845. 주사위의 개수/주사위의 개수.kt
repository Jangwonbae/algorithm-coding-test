class Solution {
    fun solution(box: IntArray, n: Int): Int = box.fold(1) {a,v -> a*(v/n)}
}