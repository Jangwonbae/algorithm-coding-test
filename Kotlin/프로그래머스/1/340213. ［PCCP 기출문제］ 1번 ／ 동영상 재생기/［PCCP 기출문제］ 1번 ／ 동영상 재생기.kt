class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {

        var video_len_second = convertSecond(video_len)
        var op_start_second = convertSecond(op_start)
        var op_end_second = convertSecond(op_end)
        var pos_second = skipOpening(convertSecond(pos), op_start_second, op_end_second)
        
        commands.forEach{
            when(it) {
                "next" -> pos_second = skipOpening(next(pos_second, video_len_second), op_start_second, op_end_second)
                else -> pos_second = skipOpening(prev(pos_second), op_start_second, op_end_second)
            }
        }   
        return convertTimeFormat(pos_second)
    }
    fun next(pos : Int, video_len : Int) : Int {
        return if(pos+10 > video_len) video_len else pos+10
    }
    fun prev(pos : Int) : Int {
        return if(pos-10 < 0) 0 else pos-10
    }
    fun skipOpening(pos: Int, op_start: Int, op_end: Int) : Int {
        return if(pos >= op_start && pos <=op_end) op_end else pos
    }
    fun convertSecond(time : String) : Int {
        var (m,s) = time.split(":")
        return m.toInt()*60+s.toInt()
    }
    fun convertTimeFormat(second : Int) : String {
        var m = second/60
        var mString = if(m<10) "0"+m.toString() else m.toString()
        var s = second%60
        var sString = if(s<10) "0"+s.toString() else s.toString()
        return mString+":"+sString
    }
}