class Solution {
    public long solution(long n) {
        double math = Math.sqrt(n);
        long ima = (long)math;
        System.out.print(ima);
        if(math-ima==0){
            return (ima+1)*(ima+1);
        }
        return -1;
    }
}