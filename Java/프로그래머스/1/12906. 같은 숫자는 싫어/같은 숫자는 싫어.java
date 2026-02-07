import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int x = arr[0];
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(x!=arr[i]){
                arrlist.add(arr[i]);
                x=arr[i];
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return arrlist.stream()
	.mapToInt(Integer::intValue)
    	.toArray();
    }
}