class Solution {
    fun solution(X: String, Y: String): String {
        var answer = StringBuilder("")
        var xArray = Array(10){0}
        var yArray = Array(10){0}
        X.forEach{xArray[it-'0']++}
        Y.forEach{yArray[it-'0']++}
        for(i in 9 downTo 0) {
            if(xArray[i] > 0 && yArray[i] > 0) {
                repeat(minOf(xArray[i],yArray[i])) {answer.append(i)}
            }
        }
        if(answer.isEmpty()) {
            answer.append("-1")
        } else if(answer.startsWith("0")) {
            answer = StringBuilder("0")
        }
        return answer.toString()
    }
}