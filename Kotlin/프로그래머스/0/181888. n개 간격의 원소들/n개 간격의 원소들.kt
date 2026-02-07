class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.filterIndexed{
        index, _ -> index%n==0
    }.toIntArray()
}