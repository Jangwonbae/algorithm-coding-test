import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        
        int answer = (int)Arrays.stream(nums).distinct().count();
        return nums.length/2 > answer? answer : nums.length/2;
    }
}