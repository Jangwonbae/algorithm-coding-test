class Solution {
    fun solution(n: Int): Int = n.toString(radix = 3).reversed().toInt(radix =3)
}