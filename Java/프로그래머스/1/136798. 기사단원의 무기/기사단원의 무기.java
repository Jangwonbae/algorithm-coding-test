import java.lang.Math;
class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        for(int i=1; i<=number;i++){
            System.out.println(divisor(i));
            sum += divisor(i) > limit ? power : divisor(i);
        }
        return sum;
    }
    int divisor(int n){
     
        int sum = 0;
        int sq = (int)Math.sqrt(n);
        for(int i=1; i<=sq; i++){
            if(n%i==0){
                sum+=1;
                if(n/i != i){
                    sum+=1;
                }
            }
        }
        return sum;
    }
}