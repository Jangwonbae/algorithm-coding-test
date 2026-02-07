class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        for(i in 0..number.lastIndex) {
            for(j in 0..number.lastIndex){
                if(j>i) {
                    for(k in 0..number.lastIndex) {
                        if(k>j) {
                            if(number[i]+number[j]+number[k]==0) answer++
                        }
                    }
                }
            }
        }
        return answer
    }
}