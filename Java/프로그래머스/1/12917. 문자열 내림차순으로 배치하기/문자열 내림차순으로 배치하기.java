import java.util.Arrays;
class Solution {
    public String solution(String s) {
         char [] a = s.toCharArray();
        Arrays.sort(a);
        StringBuffer sb = new StringBuffer(new String(a));
        
        return sb.reverse().toString();
    }
}