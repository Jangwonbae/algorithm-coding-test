import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> set = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j= i+1; j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = set.stream().distinct().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}