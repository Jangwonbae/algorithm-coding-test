class Solution {
    val vowels = charArrayOf('A', 'E', 'I', 'O', 'U')
    val allWords = mutableListOf<String>()

    fun solution(word: String): Int {
        generate("") // 모든 단어 생성 시작
        return allWords.indexOf(word) // 0번째가 빈 문자열이므로 인덱스가 곧 순서
    }

    fun generate(current: String) {
        if (current.length > 5) return // 최대 5글자 제한
        
        allWords.add(current)
        
        for (vowel in vowels) {
            generate(current + vowel)
        }
    }
}