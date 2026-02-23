import java.util.*
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var queue : Queue<Pair<Int, Int>> = LinkedList()
        for(i in 0..priorities.lastIndex) {
            queue.add(Pair(i, priorities[i]))
        }
        var printOrder = 0
        while(queue.isNotEmpty()) {
            var current = queue.poll()
            if(queue.any{it.second > current.second}) {
                queue.add(current)
            } else {
                printOrder++
                if (current.first == location) {
                    return printOrder
                }
            }
        }
        return printOrder
    }
}