import java.util.ArrayList;
class Solution {
    public int solution(String[] babbling) {
        ArrayList<String> po = new ArrayList<>();
        int result = 0;
        for(int i = 0; i<babbling.length;i++){
            if(!(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") 
               || babbling[i].contains("woowoo") || babbling[i].contains("mama"))){
                po.add(babbling[i]);
            }
        }
        for(int i=0; i<po.size();i++){
            String a = po.get(i);
            if(!a.equals("")){
                a= a.replace("aya",":").replace("ye",":").replace("woo",":").replace("ma",":");
                a=a.replace(":","");
                result += a.equals("") ? 1 : 0 ;
            }    
        }
        
        return result;
    }
}