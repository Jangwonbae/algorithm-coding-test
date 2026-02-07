class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var totalPrice = count.toLong()*(count+1)/2*price
        var needMoney = totalPrice-money
        return if(needMoney>0) needMoney else 0
    }
}