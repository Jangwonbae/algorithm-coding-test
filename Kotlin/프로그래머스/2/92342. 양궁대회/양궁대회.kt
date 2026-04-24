class Solution {
    private var maxDiff = 0
    private var answer = intArrayOf(-1)
    private lateinit var apeachInfo: IntArray

    fun solution(n: Int, info: IntArray): IntArray {
        apeachInfo = info
        dfs(n, 0, IntArray(11))
        return answer
    }

    private fun dfs(arrowsLeft: Int, index: Int, ryanInfo: IntArray) {
        // 모든 과녁 점수를 확인했거나 화살을 다 쓴 경우
        if (index == 11) {
            val currentRyan = ryanInfo.copyOf()
            // 남은 화살은 모두 0점에 몰아주기 (가장 낮은 점수 우선 원칙)
            if (arrowsLeft > 0) currentRyan[10] += arrowsLeft
            
            calculateScore(currentRyan)
            return
        }

        // 1. 점수를 획득하는 경우 (어피치보다 한 발 더 쏠 수 있을 때만)
        val needed = apeachInfo[index] + 1
        if (arrowsLeft >= needed) {
            ryanInfo[index] = needed
            dfs(arrowsLeft - needed, index + 1, ryanInfo)
            ryanInfo[index] = 0 // 백트래킹 원복
        }

        // 2. 점수를 포기하는 경우
        dfs(arrowsLeft, index + 1, ryanInfo)
    }

    private fun calculateScore(ryan: IntArray) {
        var ryanScore = 0
        var apeachScore = 0

        for (i in 0..10) {
            val score = 10 - i
            if (ryan[i] == 0 && apeachInfo[i] == 0) continue
            
            if (ryan[i] > apeachInfo[i]) ryanScore += score
            else apeachScore += score
        }

        val diff = ryanScore - apeachScore
        if (diff > 0 && diff >= maxDiff) {
            if (diff > maxDiff) {
                maxDiff = diff
                answer = ryan
            } else {
                // 점수 차가 같다면 낮은 점수를 더 많이 맞춘 쪽 선택
                if (isBetter(ryan)) answer = ryan
            }
        }
    }

    private fun isBetter(newRyan: IntArray): Boolean {
        for (i in 10 downTo 0) {
            if (newRyan[i] > answer[i]) return true
            else if (newRyan[i] < answer[i]) return false
        }
        return false
    }
}