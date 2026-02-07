import java.util.stream.IntStream;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1;i<food.length;i++){
             for(int j=0; j<food[i]/2; j++){
                 answer+=i+"";
             }
        }
        StringBuffer sb = new StringBuffer(answer);
        String rb = sb.reverse().toString();
        return answer+"0"+rb;
    }
}