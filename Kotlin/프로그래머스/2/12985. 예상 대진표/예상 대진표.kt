class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var x = a
        var y = b
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")

        while((x+1)/2 != (y+1)/2) {
            x = (x+1)/2
            y = (y+1)/2
            answer++
        }
        
        // 1 2 3 4 5 6 7 8 //1
        // 1 1 2 2 3 3 4 4
        // 1 1 1 1 2 2 2 2
        // 1 1 1 1 1 1 1 1
        // 1 2 3 4 //2
        // 1 2 //3
        
        return answer
    }
}