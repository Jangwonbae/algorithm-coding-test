import kotlin.math.pow
class Solution {
    fun solution(num_list: IntArray) = if(num_list.fold(1) {acc, v -> acc*v} < num_list.fold(0) {acc, v -> acc+v}.toDouble().pow(2).toInt()) 1 else 0
}