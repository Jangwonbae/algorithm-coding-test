class Solution {
    val current = IntArray(5)
    var count = 0
    fun solution(n: Int, q: Array<IntArray>, ans: IntArray): Int {
        dfs(0, 1, n, q, ans)
        return count
    }
    fun dfs(index: Int, start: Int, n: Int, q: Array<IntArray>, ans: IntArray) {
        if(index == current.size) {
            if(isPossible(q, ans)) {
                count++
            }
            return
        }
        
        for(i in start..n) {
            current[index] = i
            dfs(index+1, i+1, n, q, ans)
        }
    }
    fun isPossible(q: Array<IntArray>, ans: IntArray): Boolean {
        var check = 0
        for(i in q.indices) {
            for(question in q[i]) {
                if(current.contains(question)) {
                    check++
                }
            }
            if(check != ans[i]) {
                return false
            }
            check = 0
        }
        return true
    }
}