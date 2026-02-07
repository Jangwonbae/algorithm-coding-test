class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            String s = i%2==0?"수":"박";
            answer+=s;
        }
        return answer;
    }
}