class Solution {
    public boolean solution(String s) {
        char [] a = s.toCharArray();
        
        if(!(a.length==4) && !(a.length==6) ){
            return false;
        }
        for(int i =0; i<a.length;i++){
            if(a[i]>57 || a[i]<48){
                return false;
            }
        }
        return true;
    }
}