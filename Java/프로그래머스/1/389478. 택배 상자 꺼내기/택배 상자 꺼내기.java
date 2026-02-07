class Solution {
    public int solution(int n, int w, int num) {
        int targetFloor = num%w == 0 ? num/w : num/w+1;
        int endFloor = n%w== 0 ? n/w : n/w+1;
        
        
         
        int targetTh = findTh(targetFloor, num, w);
        int endTh = findTh(endFloor, n, w);
        
        int x=0;
        if(endFloor%2==1){
            x = endTh >= targetTh ? 1 : 0;
        } else {
            x = endTh <= targetTh ? 1 : 0;
        }
        
        return endFloor-targetFloor+x;
    }
    public int findTh(int floor, int number, int w) {
        //홀수 나머지가 0이면 3, 1이면 1, 2면 2
        //짝수 나머지가 0이면 1, 1이면 3, 2면 2
        int th = 0;
        if(floor%2 == 1) {//홀수
            if(number%w == 0) {
                th = w;
            } else {
                th = number%w;
            }
        } else {//짝수
            if(number%w == 0) {
                th = 1;
            } else {
                th = w - number%w +1;
            }
        }
        return th;
    }
}