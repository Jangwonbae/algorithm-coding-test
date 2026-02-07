class Solution {
    fun solution(s: String): Int {
        var result = s
        val number = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        number.forEachIndexed{i,v -> result = result.replace(v, i.toString())}
        return result.toInt()
    }
}