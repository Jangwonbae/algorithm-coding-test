class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        for (i in s.indices) {
            val rotated = s.substring(i) + s.substring(0, i)

            if (isRight(rotated)) {
                answer++
            }
        }

        
        return answer
    }
    fun isRight(s: String) : Boolean {
        var result = true
        var stackList = mutableListOf<Char>()
    
        s.forEach{
            it -> when(it) {
                '[' -> {stackList.add(it)}
                ']' -> {
                    if(stackList.size == 0) {
                        return false
                    } else{
                        if(stackList[stackList.lastIndex] != '[') {
                            return false
                        } else{
                            stackList.removeAt(stackList.lastIndex)
                        }
                    }
                }
                '{' -> {stackList.add(it)}
                '}' -> {
                    if(stackList.size == 0) {
                        return false
                    } else{
                        if(stackList[stackList.lastIndex] != '{') {
                            return false
                        } else{
                            stackList.removeAt(stackList.lastIndex)
                        }
                    }
                }
                '(' -> {stackList.add(it)}
                ')' -> {
                    if(stackList.size == 0) {
                        return false
                    } else{
                        if(stackList[stackList.lastIndex] != '(') {
                            return false
                        } else{
                            stackList.removeAt(stackList.lastIndex)
                        }
                    }
                }
                else -> {
                    
                }
            }
        }
        
        if(!stackList.isEmpty()) {
            result = false
        }
        return result
    }
}