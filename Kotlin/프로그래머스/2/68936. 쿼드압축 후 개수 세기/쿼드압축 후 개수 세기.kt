class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        fun quadTree(startRow: Int, startCol: Int, endRow: Int, endCol: Int) {
            var isAllSame = true
            val firstValue = arr[startRow][startCol]
            
            for (i in startRow..endRow) {
                for (j in startCol..endCol) {
                    if (arr[i][j] != firstValue) {
                        isAllSame = false
                        break
                    }
                }
                if (!isAllSame) break
            }
            if(isAllSame) {
                when(firstValue) {
                    0 -> answer[0]++
                    1 -> answer[1]++
                    else -> {}
                }
            } else {
                val midRow = (startRow + endRow) / 2
                val midCol = (startCol + endCol) / 2
                
                quadTree(startRow, startCol, midRow, midCol)           // 왼쪽 위
                quadTree(startRow, midCol + 1, midRow, endCol)         // 오른쪽 위
                quadTree(midRow + 1, startCol, endRow, midCol)         // 왼쪽 아래
                quadTree(midRow + 1, midCol + 1, endRow, endCol)       // 오른쪽 아래
            }
        }
        quadTree(0, 0, arr.lastIndex, arr[0].lastIndex)
        
        return answer
    }
    
}