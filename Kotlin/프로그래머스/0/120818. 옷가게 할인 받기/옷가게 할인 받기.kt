class Solution {
    fun solution(price: Int): Int = when {
        price>= 500000 -> (price.toDouble()*80/100).toInt()
        price>= 300000 -> (price.toDouble()*90/100).toInt()
        price>= 100000 -> (price.toDouble()*95/100).toInt()
        else -> price
    }
}