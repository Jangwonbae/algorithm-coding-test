class Solution {
    fun solution(places: Array<Array<String>>): IntArray {
        var answer = mutableListOf<Int>() 
        
        val dx1 = listOf(-1, 1, 0, 0)//상하좌우
        val dy1 = listOf(0, 0, -1, 1)
        val dx2 = listOf(-2, 2, 0, 0, -1, 1, 1, -1)//상하좌우 오위 오아 왼아 왼위
        val dy2 = listOf(0, 0, -2, 2, 1, 1, -1, -1)
        
        
        
        for(place in places) {
            var result = 1
            loop@for(i in 0 until 5) {
                for(j in 0 until 5) {
                    if(place[i][j] == 'P') {
                        for(k in 0 until 4) {//길이가 1인 위치에 P가 있는지 확인
                            val nx = i + dx1[k]
                            val ny = j + dy1[k]
                            if(nx in 0 until 5 && ny in 0 until 5 && place[nx][ny] == 'P') {
                                result = 0
                                break@loop
                            }
                        }
                        for(k in 0 until 8) {//길이가 2인 위치에 P가 있는지 확인
                            val nx = i + dx2[k]
                            val ny = j + dy2[k]
                            if(nx in 0 until 5 && ny in 0 until 5 && place[nx][ny] == 'P') {
                                if(k in 0 until 4) {//상하좌우 2
                                    if(place[i+dx1[k]][j+dy1[k]] != 'X') {
                                        result = 0
                                        break@loop
                                    }
                                } else {//대각
                                    if(place[nx][j] != 'X' || place[i][ny] != 'X') {
                                        result = 0
                                        break@loop
                                    }
                                }
                            }
                        }
                    }
                }
            }
            answer.add(result)
        }
        return answer.toIntArray()
    }
}