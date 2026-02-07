class Solution {
    fun solution(answers: IntArray): IntArray {
        var one = intArrayOf(1, 2, 3, 4, 5)
        var two = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var three = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var noLikeMathPeople = arrayOf(one,two,three)
        
        var oneScore = score(one, answers)
        var twoScore = score(two, answers)
        var threeScore = score(three, answers)
        var scores = intArrayOf(oneScore, twoScore, threeScore)
        
        return scores.mapIndexed{i, v -> if(v == scores.maxOrNull()) i+1 else 0}.filter{index -> index!=0}.toIntArray()
    }
    fun score(submit : IntArray, answers : IntArray) : Int{
        var cnt = 0
        for(i in 0..answers.lastIndex) {
            if(answers[i] == submit[i%submit.size]) {
                cnt++
            }
        }
        return cnt
    }
}