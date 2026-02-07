import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        return f(d,budget,0);
    }
    int f(int []d, int budget, int index){
        if( index>d.length-1){
            return 0;
        }
        if(budget-d[index]<0 ){
            return 0;
        }
        else{
            budget-=d[index];
            return 1+f(d,budget,index+1 );
        }
        
    }
}