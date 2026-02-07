class Solution {
    fun solution(n: Int, control: String): Int = control.fold(n) {n,v -> when(v) {
        'w' -> n+1
        's' -> n-1
        'd' -> n+10
        else -> n-10
    }}
}