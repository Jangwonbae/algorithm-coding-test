class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] skipString = skip.split("");
        for(int i=0; i<skipString.length; i++) {
            alphabet = alphabet.replace(skipString[i],"");
        }
        for(int j=0; j<s.length(); j++) {
               for(int k=0; k<alphabet.length(); k++) {
                   if(s.charAt(j) == alphabet.charAt(k)) {
                       int realIndex = (k+index) % alphabet.length();
                       answer+=alphabet.charAt(realIndex);
                       }
            }
            }
        return answer;
    }}