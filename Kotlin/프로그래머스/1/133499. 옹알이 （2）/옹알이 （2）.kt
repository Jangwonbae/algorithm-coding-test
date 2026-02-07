class Solution {
    val kotoba = arrayOf("aya", "ye", "woo", "ma")
    fun solution(babbling: Array<String>): Int = babbling.count{removeWord(it).isEmpty()}

    fun removeWord(word : String) : String{
        var result = word
        for(i in 0..kotoba.lastIndex) {
            if(word.startsWith(kotoba[i])) {
                result = word.replaceFirst(kotoba[i],"") 
                if(result.startsWith(kotoba[i])) {
                    return result
                }
            } 
        }
        return if(result==word) result else removeWord(result)
    }
}