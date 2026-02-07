class Solution {
    boolean solution(String s) {
        String up = s.toUpperCase();
        int p=0;
        int y=0;
        
        String arr[] = up.split("");
        for (int i=0; i<arr.length; i++){
            if(arr[i].equals("P")){
                p++;
            }
            else if (arr[i].equals("Y")){
                y++;
            }
        }

        return p==y;
    }
    
}