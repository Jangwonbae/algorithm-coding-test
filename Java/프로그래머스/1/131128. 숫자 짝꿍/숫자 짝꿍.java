class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xNum = new int[10];
        int[] yNum = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<X.length(); i++) {
            int x = Integer.parseInt(X.substring(i,i+1));
            xNum[x]++;
        }
        for(int i=0; i<Y.length(); i++) {
            int y = Integer.parseInt(Y.substring(i,i+1));
            yNum[y]++;
        }
        for(int i=9; i>=0; i--) {
            if(xNum[i] != 0 && yNum[i] != 0) {
                int z = xNum[i] > yNum[i] ? yNum[i] : xNum[i];
                for(int j=0; j<z; j++) {
                    sb.append(i);
                    // answer+=i;
                }
            }
        }
        if(sb.length() == 0) {
            // answer = "-1";
            return "-1";
        } else if(sb.charAt(0)=='0') {
            // answer = "0";
            return "0";
        }
        
        // return answer;
        return sb.toString();
    }
}