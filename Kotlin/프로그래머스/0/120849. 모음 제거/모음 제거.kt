class Solution {
    fun solution(my_string: String) = my_string.filterNot {
        when {
            (it == 'a') -> true
            (it == 'e') -> true
            (it == 'i') -> true
            (it == 'o') -> true
            (it == 'u') -> true
            else -> false
        }
    }
}