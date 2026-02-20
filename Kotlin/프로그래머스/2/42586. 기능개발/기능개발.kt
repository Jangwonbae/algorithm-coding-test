class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var day = getDaysUntilCompletion(progresses[0], speeds[0])
        var count = 1
        for(i in 1.until(progresses.size)) {
            var time = getDaysUntilCompletion(progresses[i], speeds[i])
            if(time > day) {
                day = time
                answer+=count
                count = 1
            } else {
                count++ 
            }
            if(answer.sum() != progresses.count() && i ==progresses.lastIndex) {
                answer+=count
            }
        }
        return answer
    }
    fun getDaysUntilCompletion(pregress : Int, speed : Int) : Int{
        var time = (100-pregress)/speed
        if((100-pregress)%speed > 0) {
            time+=1
        }
        return time
    }
}