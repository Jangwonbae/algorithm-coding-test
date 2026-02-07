class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        var array = my_string.toCharArray()
        var temp = array[num1]
        array[num1] =  array[num2]
        array[num2] = temp
        return String(array)
    }
}