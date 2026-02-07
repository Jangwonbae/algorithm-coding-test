class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var boxs = Array((n+w-1)/w){IntArray(w)}
        var box = 1
        var answer: Int = 0
        for(i in 0..boxs.lastIndex) {
            if(i%2==0) {
                for(j in 0..boxs[i].lastIndex) {
                    if(box>n) break
                    boxs[i][j] = box++
                }
            } else {
                for(j in boxs[i].lastIndex downTo 0) {
                    if(box>n) break
                    boxs[i][j] = box++
                }
            }
        }
        for(i in 0..boxs.lastIndex) {
             for(j in 0..boxs[i].lastIndex) {
                 if(boxs[i][j] == num) {
                     var row = i
                     while(row <= boxs.lastIndex) {
                         if(boxs[row][j] != 0 && boxs[row][j] <= n) {
                             answer++
                             
                         }
                         row++
                     }
                 }
             }
        }
        
        return answer
    }
}