import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] supo = new int[3];
        
        int[] supo_1 = {1, 2, 3, 4, 5};
        int[] supo_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        for(int i=0; i<answers.length;i++){
            supo[0] += answers[i] == supo_1[i%5] ? 1 : 0;
            supo[1] += answers[i] == supo_2[i%8] ? 1 : 0;
            supo[2] += answers[i] == supo_3[i%10] ? 1 : 0;
        }
        int max = 0;
        for(int i=0; i<3; i++){
            max = supo[i] > max? supo[i] : max;
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(supo[i]==max){
                a.add(i+1);
            }
        }
        return a;
        

    }
}