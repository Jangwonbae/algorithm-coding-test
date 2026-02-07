import java.util.*;

public class Solution {
    public int solution(int n) {
        int h = n/10;
        int m = n%10;
        if(h == 0){
            return m;
        }
        else{
            return m+solution(h);
            
        }
    }
    
}