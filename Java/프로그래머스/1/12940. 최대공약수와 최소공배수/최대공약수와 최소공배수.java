class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int h= n>m?f(n,m):f(m,n);
        answer=new int[2];
        answer[0]=h;
        answer[1]=n*m/h;
        return answer;
    }
    int f(int x,int y){
        if(y==0){
            return x;
        }
        else{
            return f(y,x%y);
        }
    }
}