// class Solution {
//     fun solution(targets: Array<IntArray>): Int {
//         var answer: Int = 0
//         val sortedTargets = targets.sortedBy{ it[0] }
//         var lastIndex = -1
//         for(target in sortedTargets) {
//             var s = target[0]
//             var e = target[1]
            
//             if(s >= lastIndex) {
//                 answer++
//                 lastIndex = e
//             }
            
//         }
//         return answer
//     }
// }
class Solution {
    fun solution(targets: Array<IntArray>): Int {
        // 1. 종료 지점(e)을 기준으로 오름차순 정렬
        // 종료 지점이 같다면 시작 지점은 결과에 영향을 주지 않으므로 it[1]만으로 정렬해도 무방합니다.
        val sortedTargets = targets.sortedBy { it[1] }

        var answer = 0
        var lastIntercept = -1 // 마지막 요격 미사일이 커버하는 지점 (정수 관리)

        for (target in sortedTargets) {
            val s = target[0]
            val e = target[1]

            // 현재 타겟의 시작 지점(s)이 마지막 요격 지점보다 크거나 같다면
            // 기존 미사일로는 이 구간을 요격할 수 없으므로 새로 발사합니다.
            if (s >= lastIntercept) {
                answer++
                // 요격 미사일을 현재 구간의 끝부분(e)에 쏩니다.
                // 개구간이므로 e 지점 자체에서는 요격이 안 되지만, 
                // 다음 구간의 s가 이 e보다 작아야만 같이 요격됩니다.
                lastIntercept = e
            }
        }

        return answer
    }
}