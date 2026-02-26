import java.util.Stack

class Solution {
    fun solution(numbers: IntArray): IntArray {
        // 모든 값을 -1로 초기화 (큰 수를 못 찾을 경우 대비)
        val answer = IntArray(numbers.size) { -1 }
        val stack = Stack<Int>()

        for (i in numbers.indices) {
            // 스택이 비어있지 않고, 현재 숫자가 스택 맨 위 인덱스의 숫자보다 크다면?
            // 바로 '뒤에 있는 큰 수'를 찾은 것입니다!
            while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
                val index = stack.pop()
                answer[index] = numbers[i]
            }
            // 현재 인덱스를 스택에 넣고 다음으로 넘어갑니다.
            stack.push(i)
        }

        return answer
    }
}