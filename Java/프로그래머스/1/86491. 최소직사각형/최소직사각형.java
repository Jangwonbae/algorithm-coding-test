import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0;i<sizes.length;i++){
            int temp=0;
            if(sizes[i][0]<sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        
        return maxSize(sizes, 0)*maxSize(sizes, 1);
    }
    int maxSize(int[][] sizes, int idx){
        int max=0;
        for(int i =0; i<sizes.length;i++){
            if(max<sizes[i][idx]){
                max=sizes[i][idx];
            }
        }
        return max;
    }
}