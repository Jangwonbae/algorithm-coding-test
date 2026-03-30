import java.util.*
import java.util.Queue
class Solution {
    fun solution(maps: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        val rows = maps.size
        val columns = maps[0].length
        
        val visited = Array(rows){BooleanArray(columns)}
        
        for(row in 0 until rows) {
            for(column in 0 until columns) {
                
                if(maps[row][column] != 'X' && !visited[row][column]) {
                    var sum = 0
                    val queue : Queue<IntArray> = LinkedList()
                    queue.add(intArrayOf(row, column))
                    visited[row][column] = true
                    while(queue.isNotEmpty()) {
                        var (x, y) = queue.poll()
                        sum += (maps[x][y]-'0')
                        if(x-1 >= 0 && maps[x-1][y] != 'X' && !visited[x-1][y]) {
                            visited[x-1][y] = true
                            queue.add(intArrayOf(x-1, y))
                        }
                        if(x+1 < rows && maps[x+1][y] != 'X' && !visited[x+1][y]) {
                            visited[x+1][y] = true
                            queue.add(intArrayOf(x+1, y))
                        }
                        if(y-1 >= 0 && maps[x][y-1] != 'X' && !visited[x][y-1]) {
                            visited[x][y-1] = true
                            queue.add(intArrayOf(x, y-1))
                        }
                        if(y+1 < columns && maps[x][y+1] != 'X' && !visited[x][y+1]) {
                            visited[x][y+1] = true
                            queue.add(intArrayOf(x, y+1))
                        }
                    
                    }
                    answer += sum
                    sum = 0
                }
            }
        }
        if(answer.isEmpty()) {
            return intArrayOf(-1)
        } else {
            return answer.sorted().toIntArray()
        }
    }
}