class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        var totalTopping = HashMap<Int, Int>()
        topping.forEach{
            totalTopping[it] = (totalTopping[it] ?: 0) + 1
        }
        var myTopping = HashMap<Int, Int>()
        topping.forEach{
            myTopping[it] = (myTopping[it] ?: 0) + 1
            totalTopping[it] = totalTopping[it]!! -1
            if(totalTopping[it] == 0) totalTopping.remove(it)
            var myToppingCount = myTopping.count()
            var broToppingCount = totalTopping.count()
            if(myToppingCount == broToppingCount) answer++
        }
        
        return answer
    }
}