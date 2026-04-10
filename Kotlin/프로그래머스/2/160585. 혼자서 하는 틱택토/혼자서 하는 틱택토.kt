class Solution {
    fun solution(board: Array<String>): Int {
        //'O'가 이겼으면 X의 개수가 'O' 개수 -1 이고 'X'는 이기지 못함
        //'X'가 이겼으면 O의 개수가 'X' 개수 'O'는 이기지 못함
        //둘 다 이기지 못했다면 'O'와 'X'의 개수가 같거나, 'O'가 한개 더 많거나
        //위가 전부 참이면 규칙은 지켜짐
        //필요한 것 O가 이겼는지, X가 이겼는지, O 개수, X개수
        
        var isOCount = 0
        var isXCount = 0
        for(row in board) {
            for(col in row) {
                when(col) {
                    'O' -> isOCount++
                    'X' -> isXCount++
                    else -> {}
                }
            }
        }
        fun isCheckWin(p: Char): Boolean {
        // 가로, 세로 확인
        for (i in 0..2) {
            if (board[i].all { it == p }) return true
            if ((0..2).all { board[it][i] == p }) return true
        }
        // 대각선 확인
        if (board[1][1] == p) {
            if (board[0][0] == p && board[2][2] == p) return true
            if (board[0][2] == p && board[2][0] == p) return true
        }
        return false
        }
        var isOWin = isCheckWin('O')
        var isXWin = isCheckWin('X')
        
        if(isOWin) {
            if(isOCount-1 == isXCount && !isXWin) return 1
        }
        if(isXWin) {
            if(isOCount == isXCount && !isOWin) return 1
        }
        if(!isOWin && !isXWin) {
            if(isOCount == isXCount || isOCount-1 == isXCount) return 1
        }
        return 0
    }
}