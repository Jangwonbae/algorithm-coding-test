class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in 0..nums.lastIndex) {
            if(i<=nums.lastIndex-2) {
                for(j in i+1..nums.lastIndex) {
                    if(j<=nums.lastIndex-1) {
                        for(k in j+1..nums.lastIndex) {
                            if(isPrime(nums[i]+nums[j]+nums[k])) {
                                answer++
                            }
                        }
                    }
                }
            }
        }

        return answer
    }
    fun isPrime(n : Int) : Boolean{
        var result = true
        for(i in 2..n-1) {
            if(n%i==0) {
                result = false
                break
            }
        }
        return result
    }
}