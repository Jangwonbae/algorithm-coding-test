class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        //number만큼의 want 리스트를 생성
        //정렬 후 discount의 부분 배열을 정열 하여 같은 배열인지 비교
        
        var wantList = mutableListOf<String>()
        number.forEachIndexed{
            i,v ->
            repeat(v){wantList.add(want[i])}
        }
        wantList.sort()
        
        for(i in 0..(discount.size - wantList.size)) {
            var s = discount.slice(i..(i+wantList.lastIndex)).sorted()
            if(wantList==s) {
                answer++
            }
        }
        
        return answer
    }
}