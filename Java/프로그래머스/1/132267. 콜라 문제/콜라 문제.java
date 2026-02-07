class Solution {
    public int solution(int a, int b, int n) {
        return n<a?0:b*(n/a)+solution(a,b,b*(n/a)+n%a);
    }
    
}