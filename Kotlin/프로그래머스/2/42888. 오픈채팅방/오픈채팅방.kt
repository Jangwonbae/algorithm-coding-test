class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = arrayOf<String>()
        
        var hm = HashMap<String, String>()
        
        var recordArrayList = record.map{it.split(" ")}
        recordArrayList.filter{it[0] == "Enter" ||  it[0] == "Change"}.forEach{
            hm.put(it[1], it[2])
        }
        
        answer = recordArrayList.filter{
            it[0] == "Enter" ||  it[0] == "Leave"
        }. map {
            var name = hm.get(it[1])
            when(it[0]) {
                "Enter" -> "${name}님이 들어왔습니다."
                "Leave" -> "${name}님이 나갔습니다."
                else -> ""
            }
        }.toTypedArray()
        
        
        return answer
    }
}