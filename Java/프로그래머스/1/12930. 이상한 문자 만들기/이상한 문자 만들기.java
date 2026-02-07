class Solution {
    public String solution(String s) {
        String word[] = s.split("");
        int w = 0;
        for(int i=0; i<word.length;i++){
            if(word[i].equals(" ")){
                w=0;
            }else{
                if(w%2==0){
                    word[i]=word[i].toUpperCase();
                }else{
                    word[i]=word[i].toLowerCase();
                }
                w++;
            }
        }         
        return String.join("", word);
    }
}