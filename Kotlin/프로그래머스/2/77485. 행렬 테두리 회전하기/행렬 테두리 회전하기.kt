class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        val array = Array(rows) { i ->
            Array(columns) { j ->
                (i * columns + j) + 1 
            }
        }
        for(query in queries) {
            var (x1, y1, x2, y2) = query.map{it-1}
            var currnetX = x1
            var currentY = y1
            val startValue = array[x1][y1]
            var min = startValue
            
            var preValue = startValue
            
            for(y in y1+1..y2) {
                var temp = array[x1][y]
                array[x1][y] = preValue
                preValue = temp
                min = minOf(min, preValue)
            }
            for(x in x1+1..x2) {
                var temp = array[x][y2]
                array[x][y2] = preValue
                preValue = temp
                min = minOf(min, preValue)
            }
            for(y in y2-1 downTo y1) {
                var temp = array[x2][y]
                array[x2][y] = preValue
                preValue = temp
                min = minOf(min, preValue)
            }
            for(x in x2-1 downTo x1) {
                var temp = array[x][y1]
                array[x][y1] = preValue
                preValue = temp
                min = minOf(min, preValue)
            }
            
            answer += min
        }   
        return answer
    }
}