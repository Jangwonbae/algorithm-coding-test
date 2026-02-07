class Solution {
    public long solution(int price, int money, int count) {
        long answer = money-f(price,count);
        
        return answer>0?0:-answer;
    }
    long f(long price,long count){
        return count==1?price:count*price+f(price,count-1);
        
    }
}