class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        return timelogs.filterIndexed{index, time -> !islate(schedules[index], time, startday)}.count()
    }
    
    fun islate(schedule : Int, timeLog : IntArray, startDay : Int) : Boolean {
        var result = false
        for(i in 0..timeLog.lastIndex) {
            var day = i + startDay
            if(day > 7) day = day-7
            if(day < 6) {
                if(60*(timeLog[i]/100) +(timeLog[i]%100) > 60*(schedule/100) +(schedule%100) +10) {
                    result = true
                    break
                }    
            }
        }
        return result
    }
}