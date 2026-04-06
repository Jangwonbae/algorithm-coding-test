class Solution {
    fun solution(relation: Array<Array<String>>): Int {
        val rowSize = relation.size
        val colSize = relation[0].size
        val candidates = mutableListOf<Int>()

        // 1. 모든 컬럼 조합을 비트마스크로 확인 (1부터 2^n - 1까지)
        for (i in 1 until (1 shl colSize)) {
            if (!isMinimal(i, candidates)) continue // 최소성 검사
            
            if (isUnique(i, relation, rowSize, colSize)) { // 유일성 검사
                candidates.add(i)
            }
        }

        return candidates.size
    }

    // 유일성 검사: 선택된 컬럼들의 조합이 모든 행에서 유일한지 확인
    private fun isUnique(mask: Int, relation: Array<Array<String>>, rowSize: Int, colSize: Int): Boolean {
        val set = mutableSetOf<String>()
        for (r in 0 until rowSize) {
            val sb = StringBuilder()
            for (c in 0 until colSize) {
                if ((mask and (1 shl c)) != 0) {
                    sb.append(relation[r][c]).append("/") // 구분자 추가
                }
            }
            set.add(sb.toString())
        }
        return set.size == rowSize
    }

    // 최소성 검사: 이미 찾은 후보키가 현재 마스크의 부분 집합인지 확인
    private fun isMinimal(mask: Int, candidates: List<Int>): Boolean {
        for (candidate in candidates) {
            // (candidate & mask) == candidate 이면 이미 포함된 것
            if ((candidate and mask) == candidate) return false
        }
        return true
    }
}