import java.util.*;

class Solution {
    public int[] solution(long n) {
        String r[] = Long.toString(n).split("");
        int[] answer = new int[r.length];
        for(int i=answer.length-1;i>-1;i--){
            answer[answer.length-1-i]=Integer.parseInt(r[i]);
        }
        
      
        return answer;
    }
}