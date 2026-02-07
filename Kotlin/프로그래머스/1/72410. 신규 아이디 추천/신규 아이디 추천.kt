class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id.map{if (it.isLetter()) it.lowercaseChar() else it}.filter{it.isLetter() || it == '-' || it == '_' || it == '.' || it.isDigit()}.toCharArray().joinToString("")
        while (".." in answer) {
            answer = answer.replace("..", ".")
        }
        if(answer.startsWith(".")) answer = answer.slice(1..answer.lastIndex)
        if(answer.endsWith(".")) answer = answer.slice(0..answer.lastIndex-1)
        if(answer.isEmpty()) answer = "a"
        if(answer.length >= 16) {
            answer = answer.slice(0.until(15))
            if(answer.endsWith(".")) answer = answer.slice(0..answer.lastIndex-1)
        }
        while(answer.length <=2) {
            answer+=answer.last()
        }
        
        return answer
    }
}