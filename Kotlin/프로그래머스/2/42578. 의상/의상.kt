class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var ae = clothes.map{it[1]}.distinct()
        
        return ae.fold(1){
            a,v -> 
            a*(clothes.count{
                it[1]==v
            }+1)
        }-1
    }
}