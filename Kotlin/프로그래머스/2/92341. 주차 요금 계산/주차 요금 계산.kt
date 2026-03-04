import kotlin.math.ceil

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        
        var answer: IntArray = intArrayOf()
        
        val basicTime = fees[0]
        val basicFee = fees[1]
        val unitTime = fees[2]
        val unitFee = fees[3]
        val sortedRecords = records.map{it.split(" ")}.sortedBy{it[1]}
        
        val carNumList = sortedRecords.map{it[1]}.distinct()
        for(carNum in carNumList) {
            var record = sortedRecords.filter{ it[1] == carNum}
            var inTime = 0
            var totalTime = 0
            answer+=0
            record.forEachIndexed{ index, v->
                when(index%2) {
                    //입차
                    0 -> {
                        //입차를 기록
                        inTime = convertTimeFormat(v[0])
                        if(index == record.lastIndex) {
                         // 출차 정산
                            totalTime += convertTimeFormat("23:59")-convertTimeFormat(v[0])
                        }
                    }
                    //출차
                    else -> {
                        //출차 정산
                            totalTime += convertTimeFormat(v[0])-inTime    
                    }
                }
                if(index == record.lastIndex) {
                    answer[answer.lastIndex]+=settleParkingFees(basicTime, basicFee, unitTime, unitFee, totalTime)
                }
            }
        }
     
        return answer
    }
    
    fun settleParkingFees(basicTime: Int, basicFee:Int, unitTime:Int, unitFee: Int, totalTime: Int) : Int {
        var parkingFee = basicFee
        if(totalTime-basicTime > 0) {
            var restFee = ceil((totalTime - basicTime).toDouble()/unitTime.toDouble()).toInt()*unitFee
            parkingFee+=restFee
        } 
        
        
        return parkingFee
    }
    fun convertTimeFormat(timeFormat : String) : Int {
        var time = timeFormat.split(":")
        return time[0].toInt()*60 + time[1].toInt()
    }
}