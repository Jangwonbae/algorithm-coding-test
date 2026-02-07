class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        System.out.print(num);
        for(int i = 1; i <= num; i++){
            if(n%i==0){
                answer+=i;
                if(n/i != i){
                    answer+=(n/i);
                }
            }
        }
        return answer;
    }
}