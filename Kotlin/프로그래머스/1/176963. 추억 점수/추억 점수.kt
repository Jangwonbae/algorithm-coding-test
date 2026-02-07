class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        var hm = HashMap<String, Int>()
        name.forEachIndexed{i , v ->
            hm[v] = yearning[i]
        }
        
        return photo.map{it.fold(0){a,v -> a+(hm[v]?:0)}}.toIntArray()
    }
}