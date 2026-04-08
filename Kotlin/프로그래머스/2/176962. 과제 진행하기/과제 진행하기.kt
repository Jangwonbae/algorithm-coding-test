import java.util.*
class Solution {
    fun solution(plans: Array<Array<String>>): Array<String> {
        var answer = mutableListOf<String>()
        
        val sortedPlans = plans.sortedBy{it[1]}
        
        val stack = Stack<Pair<String, Int>>()
        var subject = ""
        var startTime = 0
        var endTime = 0
        for(plan in sortedPlans) {
            var sub = plan[0]
            var time = convertMin(plan[1])
            var min = plan[2].toInt()
            
            if(subject.isEmpty()) {
                subject = sub
                startTime = time
                endTime = startTime + min
            } else {
                if(endTime > time) {
                    val remainTime = endTime - time
                    stack.push(Pair(subject, remainTime))
                    subject = sub
                    startTime = time
                    endTime = startTime + min
                } else if(endTime == time) {
                    answer.add(subject)
                    subject = sub
                    startTime = time
                    endTime = startTime + min
                } else {
                    answer.add(subject)
                    var availableTime = time - endTime
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
                    subject = sub
                    startTime = time
                    endTime = startTime + min
                }
            }   
        }
        answer.add(subject)
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