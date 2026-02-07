import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {     
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        return Arrays.stream(arr).filter(i->i>Arrays.stream(arr).min().orElse(1)).toArray();
    }
}