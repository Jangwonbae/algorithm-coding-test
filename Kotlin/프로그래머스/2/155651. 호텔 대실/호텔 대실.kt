class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        //입실 시간, 퇴실 시간이 빠른 순으로 정렬하고 분으로 단위 통일
        var sortedBookTime = book_time.sortedWith(compareBy({ it[0] }, { it[1] })).map{ array->
            array.map{ time->
                convertTimeFormat(time)
            }
        }
        //필요한 방 수
        var rooms = mutableListOf<Int>()
        //손님 한명 씩 받음
        sortedBookTime.forEach{ time->
            val start = time[0]
            val end = time[1]
            var isAvailableRoom = false
            var minTime = Pair(1440, -1)
            for(i in 0..rooms.lastIndex){
                if(start >= rooms[i]) {
                    var (v1, v2) = minTime
                    if(rooms[i] < v1) {
                        minTime = Pair(rooms[i], i)
                        isAvailableRoom = true
                    }
                }
            }
            
            //이용 가능한 방이 없다면 방 추가
            if(!isAvailableRoom) {
                rooms.add(end+10)
            } else {
                var index = minTime.second
                rooms[index] = end+10
            }
        }
        
        return rooms.size
    }
    fun convertTimeFormat(time: String): Int {
        val hourMin = time.split(":")
        return hourMin[0].toInt() * 60 + hourMin[1].toInt()
    }
}