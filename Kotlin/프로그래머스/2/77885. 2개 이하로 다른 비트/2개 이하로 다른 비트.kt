import kotlin.math.pow
class Solution {
    fun solution(numbers: LongArray): LongArray {
        return numbers.map{
            var digiNum = it.toString(2)
            var result = 0L
            var allOne = true
            for(i in 0..digiNum.lastIndex) {
                if(digiNum[digiNum.lastIndex-i] == '0') {
                    if(i== 0) {
                        result = it+1L
                        allOne = false
                    } else {
                        result = it+2.toDouble().pow(i-1).toLong()
                        allOne = false
                    }
                    break
                }
            }
            if(allOne) {
                result = it+2.toDouble().pow(digiNum.length-1).toLong()
            }
            result
        }.toLongArray()
    }
}