class Solution {
    fun solution(num_list: IntArray) = if(num_list[num_list.size-1] > num_list[num_list.size-2]) num_list.plus(num_list[num_list.size-1] - num_list[num_list.size-2]) else num_list.plus(2*num_list[num_list.size-1])
}