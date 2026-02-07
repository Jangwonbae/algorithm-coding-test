class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var todayArray = today.split(".").map{it.toInt()}.toIntArray()
        for(i in 0..privacies.lastIndex) {
            var privacy = privacies[i].split(" ")
            for(j in 0..terms.lastIndex) {
                var term = terms[j].split(" ")
                if(term[0] == privacy[1]) {
                    var privacyDayArray = privacy[0].split(".").map{it.toInt()}.toIntArray()
                    privacyDayArray[1] = privacyDayArray[1]+term[1].toInt()
                    
                    var t = 12*28*todayArray[0] +28*todayArray[1] +todayArray[2]
                    var p = 12*28*privacyDayArray[0] +28*privacyDayArray[1] +privacyDayArray[2]
                
                    if(t > p-1) answer+=(i+1)
                    break
                }
            }
        }
        return answer
    }
}