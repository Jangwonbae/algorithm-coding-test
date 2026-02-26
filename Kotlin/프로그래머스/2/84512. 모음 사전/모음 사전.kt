class Solution {
    var vowels = charArrayOf('A', 'E', 'I', 'O', 'U')
    val allWords = mutableListOf<String>()
    
    fun solution(word: String): Int {
        generate("")
        return allWords.indexOf(word)
    }
    fun generate(current: String) {
            if (current.length > 5) return
            allWords.add(current)
            
            for (vowel in vowels) {
            generate(current + vowel)
            }
        }
}