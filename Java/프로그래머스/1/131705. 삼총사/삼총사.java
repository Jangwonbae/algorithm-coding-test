class Solution {
    public int solution(int[] number) {
        int answer = 0;
        return set(number, true,0, 1, 0)+set(number, false,0, 0, 0);
    }//n, 3
    //끝나는 조건 n==3 이거나 idx  > number.length-1 - (3-n) 일때
    int set(int[] number, boolean input,int idx, int n, int sum){
        sum+=input?number[idx]:0;
        if(idx  > number.length-1 - (3-n)){
            return 0;
        }
        if(n==3){
            return sum==0?1:0;
        }
        else{
            return set(number, true,idx+1, n+1, sum)+set(number, false,idx+1, n, sum);
        }
    }
}