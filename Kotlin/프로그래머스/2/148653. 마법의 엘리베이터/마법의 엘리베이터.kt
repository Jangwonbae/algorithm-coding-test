class Solution {
    fun solution(storey: Int): Int {
        var answer: Int = 0
        var carry = 0
        var reversedStorey = storey.toString().reversed()
        for(i in 0..reversedStorey.lastIndex) {
            var value = reversedStorey[i] - '0'
            value+=carry
            
            if(value > 5) {
                answer+= (10-value) 
                carry=1
            } else if(value < 5) {
                answer+=value
                carry=0
            } else {//value == 5
                answer+=5
                if(i < reversedStorey.lastIndex) {
                    val nextDigit = reversedStorey[i+1] - '0'
                    if (nextDigit >= 5) {
                        carry = 1
                    } else {
                        carry = 0
                    }
                } else {
                    carry = 0
                }
            }
        }
        answer += carry
        return answer
    }
}