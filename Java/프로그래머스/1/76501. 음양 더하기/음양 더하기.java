class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length;i++){
            absolutes[i]=signs[i]==true?absolutes[i]:-absolutes[i];
            answer+=absolutes[i];
        }
        return answer;
    }
}