class Solution {
    fun solution(food: IntArray): String {
        var answer = StringBuilder()
        for(i in 1..food.lastIndex) {
            if(food[i]/2 > 0) {
                for(j in 1..food[i]/2 ) {
                    answer.append(i)
                }
            }
        }
        return answer.toString()+"0"+answer.toString().reversed()
    }
}