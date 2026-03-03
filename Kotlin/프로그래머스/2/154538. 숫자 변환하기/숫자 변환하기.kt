import java.util.*

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        if (x == y) return 0
        
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val visited = mutableSetOf<Int>() // 이미 확인한 숫자인지 체크

        queue.add(x to 0)
        visited.add(x)

        while (queue.isNotEmpty()) {
            val (current, count) = queue.poll()

            // 3가지 연산 적용
            val nextValues = intArrayOf(current + n, current * 2, current * 3)

            for (next in nextValues) {
                if (next == y) return count + 1 // 목표 도달!
                
                // y보다 작고 아직 방문하지 않은 숫자만 큐에 삽입
                if (next < y && next !in visited) {
                    visited.add(next)
                    queue.add(next to count + 1)
                }
            }
        }

        return -1 // y를 만들 수 없는 경우
    }
}