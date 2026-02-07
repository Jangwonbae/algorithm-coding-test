class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray = arr.filter{it%divisor==0}.sorted().toIntArray().let{
        if(it.size != 0) it else intArrayOf(-1)
    }
}