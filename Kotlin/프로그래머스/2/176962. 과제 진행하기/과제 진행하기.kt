import java.util.*
class Solution {
    fun solution(plans: Array<Array<String>>): Array<String> {
        var answer = mutableListOf<String>()
        
        val sortedPlans = plans.sortedBy{it[1]}
        
        val stack = Stack<Pair<String, Int>>()
        var currentSub = ""
        var currentTime = 0
        var endTime = 0
        for(plan in sortedPlans) {
            var nextSub = plan[0]
            var nextTime = convertMin(plan[1])
            var nextDuration = plan[2].toInt()
            
            if(currentSub.isEmpty()) {
                currentSub = nextSub
                currentTime = nextTime
                endTime = currentTime + nextDuration
                continue
            } 
            if(endTime > nextTime) {
                val remainTime = endTime - nextTime
                stack.push(Pair(currentSub, remainTime))
            } else if(endTime == nextTime) {
                answer.add(currentSub)
            } else {
                answer.add(currentSub)
                var availableTime = nextTime - endTime
                while(availableTime > 0 && stack.isNotEmpty()) {
                    var (remainSub, remainTime) = stack.pop()
                    if(availableTime >= remainTime) {
                        availableTime -= remainTime
                        answer.add(remainSub)
                    } else {
                        remainTime = remainTime - availableTime
                        availableTime = 0
                        stack.push(Pair(remainSub, remainTime))
                    }
                }
            }
            currentSub = nextSub
            currentTime = nextTime
            endTime = currentTime + nextDuration
        }
        answer.add(currentSub)
        while(stack.isNotEmpty()) {
            var (remainSub, remainTime) = stack.pop()
            answer.add(remainSub)
        }
        
        
        
        return answer.toTypedArray()
    }
    fun convertMin(time: String):Int {
        val timeSplit = time.split(":")
        return timeSplit[0].toInt()*60 + timeSplit[1].toInt()
    }
}