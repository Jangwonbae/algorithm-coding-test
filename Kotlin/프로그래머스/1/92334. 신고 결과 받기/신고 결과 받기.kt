class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var reportsNum = HashMap<String, Int>()
        var reportsList = HashMap<String, MutableList<String>>()
        
        report.distinct().forEach{
            var aToB = it.split(" ")
            reportsNum.put(aToB[1],reportsNum.getOrDefault(aToB[1],0)+1)
            reportsList.getOrPut(aToB[0]) { mutableListOf() }.add(aToB[1])         
        }
        
        return id_list.map{
            reportsList.get(it)?.filter{v -> reportsNum.getOrDefault(v, 0) >= k}?.count()?:0
        }.toIntArray()
    }
}