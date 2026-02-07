class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];//체육복 있음 0
        
        for(int l : lost) {//체육복 없음 -1
            student[l-1]--;
        }
        for(int r : reserve) {//체육복 여분 있음 1
            student[r-1]++;
        }
        for(int i = 0; i < n; i++) {
            if(student[i] < 0) {
                if(i>0 && student[i-1] > 0) {
                    student[i]++;
                    student[i-1]--;
                } else if(i< n-1 && student[i+1] > 0){
                    student[i]++;
                    student[i+1]--;
                }
            }
            if(student[i] > -1) {
                answer++;
            }
        }
        
        return answer;
    }
}