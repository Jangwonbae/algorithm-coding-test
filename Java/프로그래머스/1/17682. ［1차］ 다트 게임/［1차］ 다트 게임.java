class Solution {
    public int solution(String dartResult) {
        int [] after_dartResults = new int [3];
        String str_num = "";
        int idx = 0;
        
        for(int i=0; i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            if(c>='0' && c<='9'){
                str_num+=c;
            }
            else if(c =='S' || c == 'D' || c == 'T'){
                after_dartResults[idx++] = f(Integer.parseInt(str_num), c);
                str_num = "";
                
            }
            else {
                if(c=='*'){
                    after_dartResults[idx-1]+=after_dartResults[idx-1];
                    if(idx>=2){
                        after_dartResults[idx-2]+=after_dartResults[idx-2];
                    }
                }
                else{
                    after_dartResults[idx-1]*=-1;
                }
            }
            
            
        }
        
        return after_dartResults[0]+after_dartResults[1]+after_dartResults[2];
    }
    int f(int x, char c){
        if(c=='D'){
            x*=x;
        }
        else if(c=='T'){
            x*=x*x;
        }
        return x;
    }
    
}