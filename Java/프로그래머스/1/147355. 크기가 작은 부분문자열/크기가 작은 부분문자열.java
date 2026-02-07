class Solution {
    public int solution(String t, String p) {
        int cnt=0;
        for(int i=0;i<t.length()-p.length()+1;i++){
            try{
                cnt+=Long.parseLong(t.substring(i,i+p.length()))>Long.parseLong(p)?0:1;
            }catch(Exception e){
                
            }
        }
        return cnt;
    }
}