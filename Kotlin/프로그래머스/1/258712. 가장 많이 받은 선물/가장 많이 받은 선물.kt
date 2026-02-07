class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0
        var giftTable : Array<IntArray> = Array(friends.size) {IntArray(friends.size)}
        var giftScoreTable = HashMap<String, Int>()
        friends.forEachIndexed{
            index, name -> 
            giftScoreTable[name] = index//초기 값은 map을 통해 접급속도 업하기 위한 index 값 
            giftTable[index][index] = -1//자기 자신은 -1
        }
        gifts.forEach{
            var (from, to) = it.split(" ")
            giftTable[giftScoreTable[from]!!][giftScoreTable[to]!!]++//주고받은 선물
        }
        friends.forEachIndexed{
            index, name -> 
            var give = giftTable[index].foldIndexed(0) {i,a,v -> if(i!=index) a+v else a+0}
            var take = giftTable.foldIndexed(0) {i,a,v -> if(i!=index) a+v[index] else a+0}
            giftScoreTable[name] = give - take //선물 지수 초기화
        }
        return friends.mapIndexed{
            index, name ->
            var gift = 0
            for(i in 0..friends.lastIndex) {
                if(i != index) {
                    if(giftTable[index][i] > giftTable[i][index]) {
                        gift++
                    } else if(giftTable[index][i] == giftTable[i][index]) {
                        if(giftScoreTable[name]!! > giftScoreTable[friends[i]]!!) {
                            gift++
                        }
                    }
                } 
            }
            gift
        }.maxOrNull()!!
        
    }
}