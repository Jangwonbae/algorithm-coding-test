class Solution {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        var answer: DoubleArray = doubleArrayOf()
        var collatzNums = getCollatzNums(k.toDouble())
        var n = collatzNums.lastIndex
        var sizeSumList = mutableListOf<Double>(0.0)
        
        for(i in 1..n) {
            val currntSize = (collatzNums[i-1]+collatzNums[i])/2.0
            sizeSumList+= sizeSumList[i-1] + currntSize
        }
        return ranges.map{ range->
            var start = range[0]
            var end = n + range[1]
            if(start > end) {
                -1.0
            } else {
                sizeSumList[end] - sizeSumList[start]
            }
        }.toDoubleArray()
    }
    fun getCollatzNums(k : Double): MutableList<Double> {
        var c = k
        val list = mutableListOf<Double>()
        list.add(c)
        while(c != 1.0) {
            if(c % 2.0 == 0.0) {
                c = c / 2.0
            } else {
                c = 3*c +1
            }
            list.add(c)
        }
        return list
    }
}