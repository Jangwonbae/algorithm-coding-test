class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            answer[i]=f(s, i);
        }
        
        return answer;
    }
    int f(String s, int idx){
        for(int i = idx-1; i>-1;i--){
            
            if(s.charAt(i)==s.charAt(idx)){
                return idx-i;
            }
        }
        return -1;
    }
}