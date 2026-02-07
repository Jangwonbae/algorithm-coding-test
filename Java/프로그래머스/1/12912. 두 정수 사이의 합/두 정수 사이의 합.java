class Solution {
    public long solution(int a, int b) {
        int d= a>b?-1:1;
        return ((long)(Math.abs(a-b)+1)* (2*a+(long)Math.abs(a-b)*d))/2;
    }
}