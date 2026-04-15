class Solution {
    fun solution(name: String): Int {
        var upDownCount = 0
        val n = name.length
        var minMove = n - 1 // 기본적으로 쭉 오른쪽으로 가는 경우

        for (i in 0 until n) {
            // 1. 알파벳 변경 횟수 계산
            val target = name[i] - 'A'
            upDownCount += minOf(target, 26 - target)

            // 2. 좌우 이동 횟수 계산 (연속된 A를 만났을 때)
            var next = i + 1
            while (next < n && name[next] == 'A') {
                next++
            }

            // i까지 왔다가 다시 뒤로 돌아가서 next부터 거꾸로 오는 경우와 비교
            // 1) 오른쪽으로 갔다 왼쪽으로 꺾기: i * 2 + (n - next)
            // 2) 왼쪽으로 먼저 갔다 오른쪽으로 꺾기: (n - next) * 2 + i
            val move = minOf(i * 2 + (n - next), (n - next) * 2 + i)
            minMove = minOf(minMove, move)
        }

        return upDownCount + minMove
    }
}