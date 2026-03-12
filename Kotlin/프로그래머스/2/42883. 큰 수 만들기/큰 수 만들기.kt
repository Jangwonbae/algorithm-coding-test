import java.util.*
class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        val stack = Stack<Char>()
        var count = k
        for(n in number) {
            while(stack.isNotEmpty() && stack.peek() < n && count > 0) {
                stack.pop()
                count--
            }
            stack.push(n)
        }
        
        return stack.take(number.length - k).joinToString("")
    }
}