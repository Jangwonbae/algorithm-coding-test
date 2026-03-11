class Solution {
    var visited = mutableSetOf<Int>()
    
    fun solution(numbers: String): Int {
        var answer = 0
        recurse("", numbers)
        
        for(i in visited) {
            if(isPrime(i)) answer++
        }
        return answer
    }
    fun recurse(comb: String, others:String) {
        if(comb.isNotEmpty()){
            visited.add(comb.toInt())
        }
        for(i in others.indices) {
            recurse(comb + others[i], others.substring(0, i) + others.substring(i + 1))
        }
        
    }
    fun isPrime(num: Int) : Boolean {
        if (num < 2) return false
        
        var i = 2
        while (i * i <= num) {
            if (num % i == 0) return false
            i++
        }
        return true
    }
}