import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        String num="";
        for(int i=0; i<phone_number.length()-4;i++){
            num+="*";
        }
        return num+phone_number.substring(phone_number.length()-4,phone_number.length());
    }
}