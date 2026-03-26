import java.util.*
class Solution {
    fun solution(board: Array<String>): Int {
        var answer: Int = 0
        val start = IntArray(2)
        val goal = IntArray(2)
        
        for(i in 0..board.lastIndex) {
            for(j in 0..board[0].lastIndex) {
                when(board[i][j]) {
                    'R' -> {
                        start[0] = i
                        start[1] = j
                    }
                    'G' -> {
                        goal[0] = i
                        goal[1] = j
                    }
                }
                
            }
        }
        answer = bfs(start, goal, board)
        
        
        
        return answer
    }
    fun bfs(start: IntArray, target: IntArray, board: Array<String>): Int {
        val h = board.size
        val w = board[0].length
        
        val xP = intArrayOf(-1, 1, 0, 0)
        val yP = intArrayOf(0, 0, -1, 1)
        
        val queue: Queue<Node> = LinkedList()
        val visited: Array<BooleanArray> = Array(h){BooleanArray(w)}
        
        val node = Node(start[0], start[1], 0)
        queue.add(node)
        visited[node.x][node.y] = true
        
        while(queue.isNotEmpty()) {
            val (currX, currY, currDist) = queue.poll()
            if (board[currX][currY] == 'G') {
                return currDist
            }
            for(i in 0..3) {
                var nx = currX
                var ny = currY
                
                while(true) {
                    val tx = nx + xP[i]
                    val ty = ny + yP[i]
                    
                    if(tx !in 0 until h || ty !in 0 until w || board[tx][ty] == 'D'){
                        break
                    }
                    nx = tx
                    ny = ty
                }
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true
                    queue.add(Node(nx, ny, currDist + 1))
                }
            }
            
        }
        
       
        return -1
    }
    data class Node(val x: Int, val y: Int, val dist: Int)
}