class Solution {
    fun solution(array: IntArray) = array.maxOrNull().let{it->
        intArrayOf(it?:0, array.indexOf(it?:0))
    }
}