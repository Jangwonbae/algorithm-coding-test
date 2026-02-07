class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        //현재 위치 row,col
        //장애물 위치 row, coll 여러개 
        loop@for(i in 0..park.lastIndex) {
            for(j in 0..park[i].lastIndex) {
                if(park[i][j] == 'S') {
                    answer+=i
                    answer+=j
                    break@loop
                }
            }
        }
        routes.forEach{
            var n = (it[2]-'0').toInt()
            when(it[0]) {
                'N' -> {
                    if(answer[0]-n >= 0) {
                        var result = true
                        for(i in 1..n) {
                            if(park[answer[0]-i][answer[1]] == 'X') {
                                result = false
                                break
                            }
                        }
                        if(result) answer[0]-= n 
                    }
                }
                'S' -> {
                    if(answer[0]+n <= park.lastIndex) {
                        var result = true
                        for(i in 1..n) {
                            if(park[answer[0]+i][answer[1]] == 'X') {
                                result = false
                                break
                            }
                        }
                        if(result) answer[0]+=n
                    }
                }
                'W' -> {
                    if(answer[1]-n >= 0) {
                        var result = true
                        for(i in 1..n) {
                            if(park[answer[0]][answer[1]-i] == 'X') {
                                result = false
                                break
                            }
                        }
                        if(result) answer[1]-=n
                    }
                }
                else -> {
                    if(answer[1]+n <= park[answer[0]].lastIndex) {
                        var result = true
                        for(i in 1..n) {
                            if(park[answer[0]][answer[1]+i] == 'X') {
                                result = false
                                break
                            }
                        }
                        if(result) answer[1]+=n
                    }
                }
            }
        }
        return answer
    }
}