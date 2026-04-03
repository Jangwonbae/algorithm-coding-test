class Solution {
    val answer: IntArray = intArrayOf(0,0)
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        
        val discounts = IntArray(emoticons.size)
        
        //각 이모티콘에 대하여 각기 다른 할인률을 정했을 때 유저를 돌려서 최적의 해를 찾아
        dfs(0, discounts, users, emoticons)
        
        
        return answer
    }
    fun dfs(index: Int, discounts: IntArray, users: Array<IntArray>, emoticons: IntArray) {
        if (index == emoticons.size) {
        var subscriber = 0
        var totalSales = 0 

        for (user in users) {
            val userRate = user[0]
            val userLimit = user[1]
            var currentSales = 0 

            for (i in discounts.indices) {
                if (discounts[i] >= userRate) {
                    currentSales += emoticons[i] * (100 - discounts[i]) / 100
                }
            }

            if (currentSales >= userLimit) {
                subscriber++ 
            } else {
                totalSales += currentSales 
            }
        }

        
        if (subscriber > answer[0]) {
            answer[0] = subscriber
            answer[1] = totalSales
        } else if (subscriber == answer[0]) {
            if (totalSales > answer[1]) {
                answer[1] = totalSales
            }
        }
        return
    }
        for (rate in intArrayOf(10, 20, 30, 40)) {
            discounts[index] = rate
            dfs(index + 1, discounts, users, emoticons)
        }
    }
}