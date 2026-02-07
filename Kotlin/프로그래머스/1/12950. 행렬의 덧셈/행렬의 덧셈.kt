class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> = arr1.mapIndexed{i ,v ->
    v.mapIndexed{j, v2 ->v2+arr2[i][j]}.toIntArray()}.toTypedArray()
}