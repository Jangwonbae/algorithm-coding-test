import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] yymmddToday = convertDay(today);
        String b = "";
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<privacies.length; i++) {
            for(String t : terms) {
                String[] yay = t.split(" ");
                String[] ps = privacies[i].split(" ");
                if(yay[0].equals(ps[1])) {
                    int[] yymmddPrivacyDay = convertDay(ps[0]);
                    yymmddPrivacyDay = plusMonth(yymmddPrivacyDay, Integer.parseInt(yay[1]));
                    // b = b + yymmddToㄴㄴday[0] +"." +yymmddToday[1] +"." +yymmddToday[2] +",,,,"
                    //     + yymmddPrivacyDay[0] +"." +yymmddPrivacyDay[1] +"." +yymmddPrivacyDay[2] +"////";
                    if(isExpire(yymmddToday, yymmddPrivacyDay)) {
                        answer.add(i+1);
                        // b = b + yymmddToday[0] +"." +yymmddToday[1] +"." +yymmddToday[2] +",,,,"
                        // + yymmddPrivacyDay[0] +"." +yymmddPrivacyDay[1] +"." +yymmddPrivacyDay[2] +"////";
                    }
                }
            }
        }
        int[] a = answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return a;
    }
    public int[] convertDay(String day) {
        String[] yymmddString = day.split("\\.");
        int[] yymmddInt = new int[3];
        if(yymmddString.length > 0) {
            yymmddInt[0] = Integer.parseInt(yymmddString[0]);
            for(int i=1; i<=2; i++) {
                if(yymmddString[i].charAt(0) == '0') {
                    if(yymmddString[i].length()>0)
                    yymmddInt[i] = Integer.parseInt(yymmddString[i].substring(1,yymmddString[1].length()));
                } else {
                    yymmddInt[i] = Integer.parseInt(yymmddString[i]);
                }
            }
        }
        
        return yymmddInt;
    }
    public int[] plusMonth(int[] day, int month) {
        int[] plusDay = day;
        plusDay[1] += month;
        if(plusDay[1] > 12) {
            plusDay[0] += plusDay[1]/12;
            plusDay[1] = plusDay[1]%12;
        }
        return plusDay;
    }
    public boolean isExpire(int[] today, int[] expireDay) {
        boolean result = false;
        if(today[0]*12*28 +today[1]*28 + today[2]+1 > expireDay[0]*12*28 +expireDay[1]*28 + expireDay[2]) {
            result = true;
        }
        return result;
    }
}