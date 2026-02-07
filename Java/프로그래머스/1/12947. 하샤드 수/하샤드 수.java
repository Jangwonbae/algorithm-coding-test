class Solution {
    public boolean solution(int x) {
        int sum = f(x);
        
        return x%sum==0;
    }
    int f(int x){
        int m = x/10;
        int na = x%10;
        if(m==0){
            return na;
        }
        else{
            return na+f(m);
        }
    }
}