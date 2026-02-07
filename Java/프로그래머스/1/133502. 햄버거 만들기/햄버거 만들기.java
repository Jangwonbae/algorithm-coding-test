import java.util.*;

class Solution {
    int answer = 0;
    public int solution(int[] ingredient) {
        List<Integer> ingredientList = new ArrayList<Integer>();
        for(int i: ingredient) {
            ingredientList.add(i);
        }
        makeBuger(ingredientList);
        return answer;
    }
    public void makeBuger(List<Integer> list) {
        List<Integer> l1 = list;
        int i;
        int k = l1.size()-3;
        for(i=0; i<k; i++) {
            if(l1.get(i)==1 && l1.get(i+1)==2 && l1.get(i+2)==3 && l1.get(i+3)==1){
                l1.remove(i+3);
                l1.remove(i+2);
                l1.remove(i+1);
                l1.remove(i);
                answer++;
                k-=4;
                if(i-4>=-1) {
                    i-=4;
                }
                else i=-1;
            }
        }
    }
}