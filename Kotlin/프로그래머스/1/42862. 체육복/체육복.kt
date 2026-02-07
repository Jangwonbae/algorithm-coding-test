class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var students = Array(n){0}
        lost.forEach{students[it-1]--}
        reserve.forEach{students[it-1]++}
        
        students.forEachIndexed{
            i, v -> 
            if(v==-1) {
                if(i>0 && students[i-1] > 0) {
                    students[i]++
                    students[i-1]--
                } else if(i<students.lastIndex && students[i+1] > 0) {
                    students[i]++
                    students[i+1]--
                }
            }
        }
        
        return students.count{it>-1}
    }
}