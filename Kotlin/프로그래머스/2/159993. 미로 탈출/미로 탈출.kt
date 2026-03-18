import java.util.*
class Solution {
    fun solution(maps: Array<String>): Int {
        val start = IntArray(2)
        val lever = IntArray(2)
        val end = IntArray(2)
        
        for(i in 0..maps.lastIndex) {
            for(j in 0..maps[i].lastIndex) {
                when(maps[i][j]) {
                    'S'-> {
                        start[0] = i
                        start[1] = j
                    }
                    'L'-> {
                        lever[0] = i
                        lever[1] = j
                    }
                    'E'-> {
                        end[0] = i
                        end[1] = j
                    }
                }
            }
        }
        //start->lever
        val startToLever = bfs(start, lever, maps)
        if(startToLever == -1) return -1
        //lever->end
        val leverToEnd = bfs(lever, end, maps)
        if(leverToEnd == -1) return -1
        
        return startToLever + leverToEnd
    }
    fun bfs(start: IntArray, target: IntArray, maps: Array<String>) : Int {
        val n = maps.size
        val m = maps[0].length
        val visited = Array(n){BooleanArray(m)}
        val queue: Queue<Node> = LinkedList()
        
        var dx = intArrayOf(-1, 1, 0, 0)//상 하 좌 우
        var dy = intArrayOf(0, 0, -1, 1)
        
        queue.add(Node(start[0], start[1], 0))
        visited[start[0]][start[1]] = true
        
        while(queue.isNotEmpty()) {
            var current = queue.poll()
            if(current.nr == target[0] && current.nc == target[1]) {
                return current.dist
            }
            for(i in 0..3) {
                var x = current.nr+dx[i]
                var y = current.nc+dy[i]
                
                if(x in 0..maps.lastIndex && y in 0..maps[0].lastIndex && maps[x][y] != 'X' && !visited[x][y]) {
                    queue.add(Node(x, y, current.dist+1))
                    visited[x][y] = true
                }
            }
            
        }
        
        return -1
    }
}
data class Node(val nr: Int, val nc: Int, val dist: Int)