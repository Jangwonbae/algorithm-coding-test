class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()
        var sets = s.drop(2).dropLast(2).split("},{").sortedBy{it.count{ch-> ch==','}}
        
        var result = mutableListOf<Int>()
        for (set in sets) {
            val numbers = set.split(",").map { it.toInt() }

            for (num in numbers) {
                if (!result.contains(num)) {
                    result.add(num)
                }
            }
        }
        return result.toIntArray()
    }
}