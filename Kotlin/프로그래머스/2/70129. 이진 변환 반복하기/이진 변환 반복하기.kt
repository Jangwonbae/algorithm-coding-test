class Solution {
    fun solution(s: String): IntArray {
        var switchCount = 0
        var RemoveZeroCount = 0
        
        var x = s
        while(x!="1") {
            var zeroCnt = x.count{it=='0'}
            RemoveZeroCount+=zeroCnt
            x = x.filter{it=='1'}.length.toString(2)
            switchCount++
        }
        return intArrayOf(switchCount, RemoveZeroCount)
    }
}