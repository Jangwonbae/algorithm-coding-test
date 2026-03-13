//0: 아래, 1: 오른쪽, 2: 대각 위
class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var snail = Array(n) { IntArray(n) }
        var num = n
        var x = 1
        var dir = 0
        var row = -1
        var column = 0
        while(num > 0) {
            for(i in 1..num){
                when(dir%3) {
                    0->{
                       row++ 
                    }
                    1->{
                        column++
                    }
                    2->{
                        row--
                        column--
                    }
                    else->{
                        
                    }
                }
                snail[row][column] = x
                x++
            }
            dir++
            num--
        }
        
        return snail.map{row -> row.filter{column-> column!=0}}.flatten().toIntArray()

    }
}