class Solution {
    private int answer = 0;
    public int solution(int[] wallet, int[] bill) {
        if(wallet[0]>= bill[0] && wallet[1]>=bill[1]){
            return answer;
        } else if(wallet[0]>= bill[1] && wallet[1]>=bill[0]){
            return answer;
        }
        if(bill[0]>bill[1]) {
            bill[0] = bill[0]/2;
        } else {
            bill[1] = bill[1]/2;
        }
        answer++;
        return solution(wallet, bill);
    }
}