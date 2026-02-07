class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var hm : HashMap<Char, Int> = HashMap()
        return s.mapIndexed{ index, v ->
            if(!hm.containsKey(v)) {
                -1
            } else {
                index-hm[v]!!
            }.also{
                hm[v] = index
            }
        }.toIntArray()
    }
}