class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(String a : seoul){
            
            if(a.equals("Kim")){
                return "김서방은 "+index+"에 있다";
            }
            index++;
        }
        return "";
    }
}