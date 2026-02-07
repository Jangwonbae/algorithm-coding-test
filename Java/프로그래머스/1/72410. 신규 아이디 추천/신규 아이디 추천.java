class Solution {
    public String solution(String new_id) {
        //1
        String answer = new_id.toLowerCase();
        
        //2
        String step2 = "";
        for(char c : answer.toCharArray()) {
            if(c >=97 && c<=122 || c==45 || c==95 || c==46 || c >=48 && c<=57) {
                step2+=Character.toString(c);
            }
        }
        answer = step2;
        //3
        while(answer.contains("..")) {
            answer = answer.replace("..",".");
        }
        
        //4
        if(answer.length() > 0 && answer.charAt(0) == '.') {
            answer = answer.substring(1,answer.length());
        }
        if(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0,answer.length()-1);
        }

        //5
        if(answer.equals("")){
            answer+="a";
        }
        //6
        if(answer.length()>15) {
            answer = answer.substring(0,15);
            if(answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0,answer.length()-1);
            }
        }
        
        //7
        while(answer.length() >0 && answer.length()<=2) {
            answer+=answer.substring(answer.length()-1,answer.length());
        }
        return answer;
    }
}