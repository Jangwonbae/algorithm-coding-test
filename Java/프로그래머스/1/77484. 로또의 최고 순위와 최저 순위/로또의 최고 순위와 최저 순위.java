import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero_cnt = (int)Arrays.stream(lottos).filter(num -> num == 0).count();
        //Arrays.sort(lottos);
        Arrays.sort(lottos);
        int dang = 0;
        for(int i=0; i<win_nums.length;i++){
            for(int j=zero_cnt; j<lottos.length;j++){
                if(win_nums[i]==lottos[j]){
                    dang+=1;
                }
            }
        }
        int answer[] = new int[2];
        answer[0]= 7 - (dang+zero_cnt) > 5 ? 6 : 7 - (dang+zero_cnt);
        answer[1]= 7 - dang > 5 ? 6 : 7 - dang;
        return answer;
    }
}