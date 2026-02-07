class Solution {
    fun solution(dot: IntArray) = when {
        dot.get(0) > 0 && dot.get(1) > 0 -> 1
        dot.get(0) < 0 && dot.get(1) > 0 -> 2
        dot.get(0) < 0 && dot.get(1) < 0 -> 3
        else -> 4
    }
}