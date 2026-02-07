class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(51,51,0,0)
        wallpaper.forEachIndexed{
            i, row ->
            row.forEachIndexed{
                j, v ->
                if(v=='#') {
                    if(i < answer[0]) answer[0] = i
                    if(j < answer[1]) answer[1] = j
                    if(i+1 > answer[2]) answer[2] = i+1
                    if(j+1 > answer[3]) answer[3] = j+1
                }
            }
        }
        return answer
    }
}