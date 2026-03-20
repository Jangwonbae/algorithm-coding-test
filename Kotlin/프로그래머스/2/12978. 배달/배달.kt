import java.util.LinkedList
import java.util.Queue
class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        var answer = 0

        val graph = Array(N + 1) { mutableListOf<IntArray>() }
        val dist = IntArray(N + 1) { Int.MAX_VALUE }
        for(r in road) {
            val (u, v, w) = r
            graph[u].add(intArrayOf(v, w))
            graph[v].add(intArrayOf(u, w))
        }

        bfs(graph, dist)
        
        return dist.filter{it <= k}.size
    }
    fun bfs(graph: Array<MutableList<IntArray>>, dist: IntArray): Int {
        var queue : Queue<IntArray> = LinkedList()
        queue.add(intArrayOf(1, 0))
        dist[1] = 0
        while(queue.isNotEmpty()) {
            val (current, currentDist) = queue.poll()
            
            if(currentDist > dist[current]) continue
            
            for(e in graph[current]) {
                val next = e[0]
                val weigt = e[1]
                
                if(dist[current] + weigt < dist[next]) {
                    dist[next] = dist[current] + weigt
                    queue.add(intArrayOf(next, dist[next]))
                }
                
            }
            
        }
        return 0
    }
}