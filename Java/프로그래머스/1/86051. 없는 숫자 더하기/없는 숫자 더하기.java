class Solution {
    public int solution(int[] numbers) {
        int [] a= new int[10];
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            a[numbers[i]]=1;
        }
        for(int i=0; i<a.length;i++){
            if(a[i]==0){
                sum+=i;
            }
        }
        return sum;
    }
}