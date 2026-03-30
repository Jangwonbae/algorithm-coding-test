class Solution {
    fun solution(p: String): String {
        return f(p)
    }
    fun f(bp: String) : String {
        if(bp.isEmpty()) {
            return ""
        }
        var left = 0
        var right = 0
        var index = -1
        
        for(i in bp.indices) {
            if(bp[i] == '(') left++
            else right++
            if(left == right) {
                index = i
                break
            }
        }
        val u = bp.substring(0..index)
        val v = bp.substring(index+1)
        
        if(isRight(u)) {
            return u+f(v)
        } else {
            var temp = ""
            temp+= "("
            temp+= f(v)
            temp+= ")"
            return temp + reverse(u.substring(1..u.lastIndex-1))
        }
        
    }
    fun isRight(bp: String): Boolean{
        var result = false
        var left = 0
        var right = 0
        for(i in bp.indices) {
            if(bp[i] == '(') left++
            else right++
            if(right>left) {
                return false
            }
        }
        if(left == right) result = true
        
        return result
    }
    fun reverse(bp: String): String {
        return bp.map{if(it == '(') ')' else '('}.joinToString("")
    }
}