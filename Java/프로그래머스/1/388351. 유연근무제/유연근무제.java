    class Solution {
        public int solution(int[] schedules, int[][] timelogs, int startday) {
            int answer = 0;
            int satIndex = 6-startday;
            int sunIndex = 7-startday;
            if(satIndex==-1){
                sunIndex=0;
                satIndex=6;
            }

            for(int i=0; i<schedules.length; i++){
                boolean late = false;
                for(int j=0; j<timelogs[i].length; j++){
                    if(!(j == sunIndex || j == satIndex) && isLate(schedules[i], timelogs[i][j])){
                        late = true;
                        break;
                    }
                }
                if(late==false){
                    answer++;
                }
            }
            return answer;
        }
        public boolean isLate(int target, int fact){
            return switchMin(target)+10 < switchMin(fact);
        }
        public int switchMin(int time) {
            return time/100*60 + time%100;
        }
    }