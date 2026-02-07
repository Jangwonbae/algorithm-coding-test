class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer : Int = 0
        array.sort()
        for(i in 0 until array.size) {
            if(array.get(i) > height) {
                answer = array.size-i
                break
            }
        }
        return answer
    }
}