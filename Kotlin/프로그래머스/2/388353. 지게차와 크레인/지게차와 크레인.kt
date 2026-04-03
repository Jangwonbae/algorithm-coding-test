import java.util.*
class Solution {
    fun solution(storage: Array<String>, requests: Array<String>): Int {
        val r = storage.size
        val c = storage[0].length
        
        val grid = Array(r + 2) { i ->
            if (i == 0 || i == r + 1) CharArray(c + 2) { '.' }
            else CharArray(c + 2) { j ->
                if (j == 0 || j == c + 1) '.' else storage[i - 1][j - 1]
            }
        }
        for(request in requests) {
            val target = request[0]
            val isCrane = request.length == 2
            
            if (isCrane) {
                for (i in 1..r) {
                    for (j in 1..c) {
                        if (grid[i][j] == target) grid[i][j] = '.'
                    }
                }
            } else {
                val targetsToRemove = mutableListOf<Pair<Int, Int>>()
                val queue: Queue<Pair<Int, Int>> = LinkedList()
                val visited = Array(r + 2) { BooleanArray(c + 2) }
                
                queue.add(0 to 0)
                visited[0][0] = true
                val dx = intArrayOf(-1, 1, 0, 0)
                val dy = intArrayOf(0, 0, -1, 1)
                while (queue.isNotEmpty()) {
                    val (currR, currC) = queue.poll()

                    for (d in 0 until 4) {
                        val nr = currR + dx[d]
                        val nc = currC + dy[d]

                        if (nr in 0 until r + 2 && nc in 0 until c + 2 && !visited[nr][nc]) {
                            if (grid[nr][nc] == '.') {
                                visited[nr][nc] = true
                                queue.add(nr to nc)
                            } else if (grid[nr][nc] == target) {
                                visited[nr][nc] = true
                                targetsToRemove.add(nr to nc)
                            }
                        }
                    }
                }
                for (pos in targetsToRemove) {
                    grid[pos.first][pos.second] = '.'
                }
            }
        }
        var answer = 0
        for (i in 1..r) {
            for (j in 1..c) {
                if (grid[i][j] != '.') answer++
            }
        }
        return answer
    }
}