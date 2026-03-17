import kotlin.math.abs
import kotlin.math.min

class Solution {
    lateinit var adj: Array<MutableList<Int>>
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var answer: Int = n
        
        adj = Array(n + 1) { mutableListOf<Int>() }
        //그래프 생성
        for(w in wires) {
            adj[w[0]].add(w[1])
            adj[w[1]].add(w[0])
        }
        
        
        for(w in wires) {
            val tower1 = w[0]
            val tower2 = w[1]
            //전선을 하나씩 제거
            adj[tower1].remove(tower2)
            adj[tower2].remove(tower1)
            
            //dfs를 활용한 완전탐색
            val count = dfs(1, BooleanArray(n+1))
            //전력망 계산, 한쪽만 계산하면 남은 한쪽은 전체에서 빼기
            answer = minOf(answer, abs(count - (n - count)))
            //두 차의 최소값이 answer
            adj[tower1].add(tower2)
            adj[tower2].add(tower1)
        }
        return answer
    }
    fun dfs(current: Int, visited: BooleanArray): Int {
        visited[current] = true
        var count = 1
        for(next in adj[current]) {
            if(!visited[next]) {
                count += dfs(next, visited)
            }
        }
        
        
        return count 
    }
}