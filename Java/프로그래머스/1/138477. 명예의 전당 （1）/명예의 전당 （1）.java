import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k];
        for(int i = 0; i<score.length; i++){
            if(i<k){
                honor[k-1-i] = score[i]; 
            }
            else{
                honor[0] = score[i] > honor[0] ? score[i] :  honor[0];
            }
            Arrays.sort(honor);
            answer[i] = i < k ? honor[k-1-i] : honor[0];
        }
        return answer;
    }
}