import java.util.ArrayList;
import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> three = new ArrayList<>();
        while(n>=3){
            three.add(n%3);
            n/=3;       
        }
        three.add(n);
        int sum=0;
        for(int i= three.size()-1;i>-1;i--){
            sum += three.get(i)*(int)Math.pow(3,three.size()-1-i);
        }
        return sum;
    }
}