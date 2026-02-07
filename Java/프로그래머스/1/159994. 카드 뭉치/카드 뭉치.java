import java.util.LinkedList; //import
import java.util.Queue; //import

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> deck1 = new LinkedList<>();
        Queue<String> deck2 = new LinkedList<>();
        for(int i=0;i<cards1.length;i++){
            deck1.add(cards1[i]);
        }
        for(int i=0;i<cards2.length;i++){
            deck2.add(cards2[i]);
        }
        
        for(int i=0;i<goal.length;i++){
            if(goal[i].equals(deck1.peek())){
                deck1.poll();
            }
            else if(goal[i].equals(deck2.peek())){
                deck2.poll();
            }
            else{
                return "No";
            }
        }
        
        return "Yes";
    }
}