class Solution {
    val map: HashMap<String, Int> = HashMap()
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val answer = mutableListOf<String>()
        
        for(order in orders) {
            var sortedOrder = order.toList().sorted()
            for(len in course) {
                combination(sortedOrder, "", 0, len)
            }
        }
        // 2. 각 코스 요리 길이(len)별로 가장 많이 주문된 조합 찾기
        for (len in course) {
            // 현재 길이(len)인 조합들만 필터링
            val items = map.filter { it.key.length == len && it.value >= 2 }
            if (items.isEmpty()) continue
            
            // 그중 최대 빈도수 찾기
            val maxOccur = items.values.maxOrNull() ?: 0
            
            // 최대 빈도수와 일치하는 메뉴들만 추가
            items.filter { it.value == maxOccur }.forEach { answer.add(it.key) }
        }

        // 3. 최종 결과 정렬 (사전순)
        return answer.sorted().toTypedArray()

    }
    fun combination(sortedOrder: List<Char>, temp: String, index: Int, targetLen: Int) {
        if(temp.length == targetLen) {
            map[temp] = map.getOrDefault(temp, 0)+1
            return
        }
        for(i in index until sortedOrder.size) {
            combination(sortedOrder, temp+sortedOrder[i].toString(), i+1, targetLen)
        }
    }
}
