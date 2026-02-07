class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String currentColor = board[h][w];
        int rowIndex = board.length-1;
        int columnIndex = board[0].length-1;
        //x랑 y가 주어지면 
        //왼쪽 : x-1, y
        //오른쪽 : x+1, y
        if(w-1>=0) {
            int count = board[h][w-1].equals(currentColor) ? 1 : 0;
            answer += count;
        }
        if(w+1<=columnIndex) {
            int count = board[h][w+1].equals(currentColor) ? 1 : 0;
            answer += count;
        }
        if(h-1>=0) {
            int count = board[h-1][w].equals(currentColor) ? 1 : 0;
            answer += count;
        }
        if(h+1<=rowIndex) {
            int count = board[h+1][w].equals(currentColor) ? 1 : 0;
            answer += count;
        }
        //위 : x, y+1
        //아래 : x, y-1
        
        return answer;
    }
}