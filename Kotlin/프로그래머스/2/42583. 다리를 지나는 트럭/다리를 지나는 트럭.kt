import java.util.Queue
import java.util.LinkedList
class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var sec = 0
        var currentWeightOnBridge = 0
        
        var waitingTrucks : Queue<Int> = LinkedList()
        val trucksOnBridge : Queue<IntArray> = LinkedList()
        
        truck_weights.forEach { waitingTrucks.add(it) }
        
        while(waitingTrucks.isNotEmpty() || trucksOnBridge.isNotEmpty()) {
            sec++
            //다리를 다 지나간 트럭 처리
            if(trucksOnBridge.isNotEmpty()) {
                val frontTruck = trucksOnBridge.peek()
                if(sec - frontTruck[1] == bridge_length) {
                    val arrivedTruck = trucksOnBridge.poll()
                    currentWeightOnBridge -= arrivedTruck[0]
                }
            }
            //새로운 트럭이 다리에 올라올 수 있는지 확인
            if(waitingTrucks.isNotEmpty()) {
                if(currentWeightOnBridge + waitingTrucks.peek() <= weight) {
                    val nextTruckWeight = waitingTrucks.poll()
                    // [트럭 무게, 진입 시간]을 큐에 저장
                    trucksOnBridge.add(intArrayOf(nextTruckWeight, sec))
                    currentWeightOnBridge += nextTruckWeight
                }
            }
        }
        
        return sec
    }
}