class Solution {
    var max = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        permute(dungeons, 0, k)
        return max
    }

    fun permute(dungeons: Array<IntArray>, depth: Int, k: Int) {
        if (depth == dungeons.size) {
            var fatigue = k
            var count = 0

            for (d in dungeons) {
                if (fatigue >= d[0]) {
                    fatigue -= d[1]
                    count++
                }
            }

            max = maxOf(max, count)
            return
        }

        for (i in depth until dungeons.size) {
            dungeons.swap(depth, i)
            permute(dungeons, depth + 1, k)
            dungeons.swap(depth, i) // 원상복구
        }
    }

    fun Array<IntArray>.swap(i: Int, j: Int) {
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }
}
