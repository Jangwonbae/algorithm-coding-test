class Solution {
    fun solution(numbers: IntArray): String {
        // 1. 숫자를 문자열로 변환
        val strings = numbers.map { it.toString() }
        
        // 2. 두 수를 이어 붙여본 뒤 내림차순 정렬 (o2+o1 vs o1+o2)
        val sorted = strings.sortedWith(Comparator { o1, o2 ->
            (o2 + o1).compareTo(o1 + o2)
        })
        
        // 3. 모든 숫자가 0인 경우(예: [0, 0, 0]) "000"이 아닌 "0"을 반환하도록 처리
        if (sorted[0] == "0") return "0"
        
        return sorted.joinToString("")
    }
}