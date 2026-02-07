class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var stageArr = Array(N){Stage(it+1,0,0)}
        
        for(i in 0..stages.lastIndex) {
            for(j in 0 until stages[i]-1) {
                stageArr[j].pass++
            }
            if(stages[i] <= N) stageArr[stages[i]-1].fail++
        }
        return stageArr.sortedByDescending { it.failRate }.map { it.level }.toIntArray()
    }
}
class Stage(var level : Int, var pass : Int, var fail : Int) {
    val failRate : Float
    get() = if (fail+pass == 0) 0.0f else (fail.toFloat()) / (pass + fail) }
//아무도 도달하지 않은 경우 0/0 방지