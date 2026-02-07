class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var maxWidth = 0
        var maxHight = 0
        //1번 제일 큰 값을 찾아
        //2번 각 배열의 두번째 값들 중 제일 큰 값을 찾아
        sizes.forEach{
            if(it[0] > it[1]) {
                if(it[0] > maxWidth) {
                    maxWidth = it[0]
                }
            } else {
                if(it[1] > maxWidth) {
                    maxWidth = it[1]
                }
            }
        }
        sizes.forEach{
            if(it[0] > it[1]) {
                if(it[1] > maxHight) {
                    maxHight = it[1]
                }
            } else {
                if(it[0] > maxHight) {
                    maxHight = it[0]
                }
            }
        }
        return maxWidth*maxHight
    }
}