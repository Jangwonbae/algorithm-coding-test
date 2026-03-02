import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val mainContainer : Queue<Int> = LinkedList()
        val subContainer = Stack<Int>()
        //1 2 3 4 5
        //4 3 1 2 5
        for(i in 1..order.size) {
            mainContainer.add(i)
        }
        order.forEach{orderNumber ->
            var r = false
            while(mainContainer.isNotEmpty() || subContainer.peek() == orderNumber) {
                r = true
                if(mainContainer.peek() == orderNumber) {
                    mainContainer.poll()
                    answer++
                    break
                } else if(subContainer.isNotEmpty() && subContainer.peek() == orderNumber) {
                    subContainer.pop()
                    answer++
                    break
                } else {
                    subContainer.add(mainContainer.poll())
                }
            }
            if(!r) {
                return answer
            }
        }
        return answer
    }
}