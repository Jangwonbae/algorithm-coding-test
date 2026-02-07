import kotlin.math.*
class Solution {
    var sq = StringBuilder()
    var leftRow = 3
    var leftCol = 0
    var rightRow = 3
    var rightCol = 2
    
    fun solution(numbers: IntArray, hand: String): String {
        var h = hand
        var keyPad = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9),arrayOf(-1,0,-1))
        numbers.forEach{
            when {
                it==1 -> pickHand(0,0,"L")
                it==4 -> pickHand(1,0,"L")
                it==7 -> pickHand(2,0,"L")
                it==3 -> pickHand(0,2,"R")
                it==6 -> pickHand(1,2,"R")
                it==9 -> pickHand(2,2,"R")
                else -> {
                    for(i in 0..3) {
                        for(j in 0..2) {
                            if(keyPad[i][j]==it) {
                                var leftMin = abs(leftRow-i)+abs(leftCol-j)
                                var rightMin = abs(rightRow-i)+abs(rightCol-j)
                                if(leftMin<rightMin) {
                                    pickHand(i,j,"L")
                                } else if(rightMin<leftMin) {
                                    pickHand(i,j,"R")
                                } else {
                                    if(h=="right") {
                                        pickHand(i,j,"R")
                                } else {
                                        pickHand(i,j,"L")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sq.toString()
    }
    fun pickHand(row :Int, col :Int, dir:String) {
        if(dir=="L") {
            leftRow = row
            leftCol = col
            sq.append("L")
        } else {
            rightRow = row
            rightCol = col
            sq.append("R")
        }
    }
}