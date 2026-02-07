class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var mbti = arrayOf("R","T","C","F","J","M","A","N")
        var score = Array(8){0}
        var posIndex = -1
        var nagIndex = -1
        survey.forEachIndexed{
            i, v ->
            when(v) {
                "RT" -> {
                    posIndex = 0
                    nagIndex = 1
                }
                "TR" -> {
                    posIndex = 1
                    nagIndex = 0
                }
                "CF" -> {
                    posIndex = 2
                    nagIndex = 3
                }
                "FC" -> {
                    posIndex = 3
                    nagIndex = 2
                }
                "JM" -> {
                    posIndex = 4
                    nagIndex = 5
                }
                "MJ" -> {
                    posIndex = 5
                    nagIndex = 4
                }
                "AN" -> {
                    posIndex = 6
                    nagIndex = 7
                }
                "NA" -> {
                    posIndex = 7
                    nagIndex = 6
                }
                else ->{
                    posIndex = -1
                    nagIndex = -1
                }
            }
           when(choices[i]) {
                   1 -> score[posIndex]+=3
                   2 -> score[posIndex]+=2
                   3 -> score[posIndex]+=1
                   5 -> score[nagIndex]+=1
                   6 -> score[nagIndex]+=2
                   7 -> score[nagIndex]+=3
                   else -> score[posIndex]+=0
               }
        }
        return (0..3).toList().map{
            if(score[2*it] >= score[2*it+1]) mbti[2*it] else mbti[2*it+1]
        }.joinToString("")
    }
}