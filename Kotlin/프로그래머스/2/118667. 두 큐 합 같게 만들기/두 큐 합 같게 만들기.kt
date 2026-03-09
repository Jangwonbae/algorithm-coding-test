import java.util.ArrayDeque

class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var answer = 0
        
        // 1. Long 타입으로 합계 계산 (Int 범위를 넘을 수 있음)
        var sum1 = queue1.sumOf { it.toLong() }
        var sum2 = queue2.sumOf { it.toLong() }
        val target = (sum1 + sum2)
        
        // 전체 합이 홀수라면 절대로 같게 만들 수 없음
        if (target % 2 != 0L) return -1
        val targetHalf = target / 2
        
        // 2. 효율적인 pop/push를 위해 ArrayDeque 사용
        val q1 = ArrayDeque<Int>()
        val q2 = ArrayDeque<Int>()
        queue1.forEach { q1.add(it) }
        queue2.forEach { q2.add(it) }
        
        // 3. 최대 반복 횟수 설정 (모든 원소가 두 번씩 이동하는 경우 고려)
        val maxOperations = queue1.size * 4
        
        // 4. 그리디 알고리즘 수행
        while (sum1 != targetHalf) {
            if (answer > maxOperations) return -1 // 불가능한 경우 탈출
            
            if (sum1 > targetHalf) {
                // q1의 합이 더 크면 q1에서 빼서 q2로 이동
                val element = q1.pollFirst()
                sum1 -= element
                sum2 += element
                q2.addLast(element)
            } else {
                // q2의 합이 더 크면 q2에서 빼서 q1으로 이동
                val element = q2.pollFirst()
                sum2 -= element
                sum1 += element
                q1.addLast(element)
            }
            answer++
        }
        
        return answer
    }
}