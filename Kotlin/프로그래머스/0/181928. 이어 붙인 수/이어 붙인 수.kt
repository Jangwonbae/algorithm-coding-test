class Solution {
    fun solution(num_list: IntArray) = num_list.filter{it%2==0}.joinToString("").toInt() + num_list.filter{it%2==1}.joinToString("").toInt()
}