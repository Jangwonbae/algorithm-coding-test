import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] existRowIndex = new int[board.length];
        ArrayList<Integer> result = new ArrayList<>();
        //init
        for(int i=0; i<existRowIndex.length; i++) {
            existRowIndex[i] = -1;
        }
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] != 0) {
                    if(existRowIndex[j] == -1){
                        existRowIndex[j] = i;
                        // answer+=i; //확인용 {3,2,1,3,1}
                    }
                }
            }
        }
        
        for(int i=0; i<moves.length; i++) {
            if(existRowIndex[moves[i]-1] < board.length && existRowIndex[moves[i]-1] != -1) {
                result.add(board[existRowIndex[moves[i]-1]][moves[i]-1]);
                if(result.size()>1 && result.get(result.size()-1) ==result.get(result.size()-2)) {
                    result.remove(result.size()-1);
                    result.remove(result.size()-1);
                    answer+=2;
                }
                existRowIndex[moves[i]-1]++;
            }
        }
        
        
        return answer;
    }
}