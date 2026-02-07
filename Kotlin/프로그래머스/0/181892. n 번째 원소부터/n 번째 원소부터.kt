class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.takeLast(num_list.size+1 - n)
}