class Solution {
    public int solution(String s) {
        int answer = 0;
        char firstChar = '1'; 
        int firstCharCount = 0;
        int notFirstCharCount = 0;
        
        for(char c : s.toCharArray()) {
            if(firstCharCount == 0) {
                firstChar = c;
                answer++;
            }
            if(c == firstChar) {
                firstCharCount++;
            } else {
                notFirstCharCount++;
                if((firstCharCount == notFirstCharCount)) {
                    firstCharCount = 0;
                    notFirstCharCount = 0;
                    
                }
            }
        }
        return answer;
    }
}