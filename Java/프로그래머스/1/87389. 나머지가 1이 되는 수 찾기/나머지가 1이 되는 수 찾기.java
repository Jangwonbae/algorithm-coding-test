class Solution {
    public int solution(int n) {
        //최소 배수>1
        for(int i=2; i<n;i++){
            if((n-1)%i==0 && i>1){
                return i;
            }
        }
        return 0;
    }
}