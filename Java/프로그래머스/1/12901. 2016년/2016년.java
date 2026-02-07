class Solution {
    public String solution(int a, int b) {
        int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week ={"THU","FRI","SAT","SUN", "MON", "TUE", "WED"};
        int sum = 0;
        for(int i=0; i<a-1; i++){
            sum+=month[i];
        }
        sum+=b;
        sum%=7;
        return week[sum];
    }
}
//1 3 5 7 8 10 12 -> 31
//4 6 9 11 -> 30
//2-> 29