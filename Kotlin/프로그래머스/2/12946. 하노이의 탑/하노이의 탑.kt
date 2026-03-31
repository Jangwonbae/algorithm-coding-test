class Solution {
    val answer = mutableListOf<IntArray>()
    fun solution(n: Int): Array<IntArray> {
        hanoi(n, 1, 3, 2)
        return answer.toTypedArray()
    }
    fun hanoi(n: Int, from: Int, to: Int, via: Int) {
        if(n==1) {
            answer.add(intArrayOf(from, to))
            return
        }
        hanoi(n-1, from, via, to)
        answer.add(intArrayOf(from, to))
        hanoi(n-1, via, to, from)
    }
}