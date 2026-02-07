class Solution {
    public int solution(int num) {
        int cnt = 0;
        long a=num;
        while(cnt<500){
            if(a==1){
                return cnt;
            }
            if(a%2==0){
                a/=2;
            }
            else{
                a=(a*3)+1;
            }
            cnt++;
        }
        return -1;
    }
}