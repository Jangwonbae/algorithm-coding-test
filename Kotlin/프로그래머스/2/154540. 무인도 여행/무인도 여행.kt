import java.util.*
import java.util.Queue
class Solution {
    fun solution(maps: Array<String>): IntArray {
        val result = mutableListOf<Int>()
        
        val rows = maps.size
        val columns = maps[0].length
    
        val visited = Array(rows){BooleanArray(columns)}
        
        val dx = intArrayOf(-1, 1, 0, 0)
        val dy = intArrayOf(0, 0, -1, 1)
                    
        for(row in 0 until rows) {
            for(column in 0 until columns) {
                if(maps[row][column] != 'X' && !visited[row][column]) {
                    var sum = 0
                    val queue : Queue<IntArray> = LinkedList()
                    
                    queue.add(intArrayOf(row, column))
                    visited[row][column] = true
                    while(queue.isNotEmpty()) {
                        val (x, y) = queue.poll()
                        sum += maps[x][y].digitToInt()
                        for(i in 0..3) {
                            val nx = x + dx[i]
                            val ny = y + dy[i]
                            if(nx in 0 until rows && ny in 0 until columns &&
                                maps[nx][ny] != 'X' && !visited[nx][ny]) {
                                visited[nx][ny] = true
                                queue.add(intArrayOf(nx, ny))
                            }
                        }
                    }
                    result.add(sum)
                }
            }
        }
        return if (result.isEmpty()) intArrayOf(-1) else result.sorted().toIntArray()
    }
}