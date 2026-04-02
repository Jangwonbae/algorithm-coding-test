class Solution {
    fun solution(diffs: IntArray, times: IntArray, limit: Long): Int {
        var low = 1
        var high = 100_000 // diff의 최대치

        var answer = high

        while (low <= high) {
            val mid = (low + high) / 2
            if (isPossible(diffs, times, limit, mid)) {
                answer = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return answer
    }

    private fun isPossible(diffs: IntArray, times: IntArray, limit: Long, level: Int): Boolean {
        var totalTime: Long = 0
        
        for (i in diffs.indices) {
            val diff = diffs[i]
            val timeCur = times[i]
            val timePrev = if (i == 0) 0 else times[i - 1]

            if (diff <= level) {
                totalTime += timeCur
            } else {
                val repeatCount = diff - level
                totalTime += repeatCount.toLong() * (timeCur + timePrev) + timeCur
            }

            // 제한 시간을 초과하면 즉시 중단하여 효율성 높임
            if (totalTime > limit) return false
        }
        
        return totalTime <= limit
    }
}