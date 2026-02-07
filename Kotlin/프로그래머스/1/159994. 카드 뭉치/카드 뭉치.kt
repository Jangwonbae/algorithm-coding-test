class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var cards1Index = 0
        var cards2Index = 0
        goal.forEachIndexed{i,v -> 
            if(cards1Index<=cards1.lastIndex && cards1[cards1Index] == goal[i]) {
                cards1Index++
            } else if(cards2Index<=cards2.lastIndex && cards2[cards2Index] == goal[i]) {
                cards2Index++
            } else {
                return "No"
            }
        }
        return answer
    }
}