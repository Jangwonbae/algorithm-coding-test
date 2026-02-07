class Solution {
    fun solution(arr: IntArray): Int = arr.fold(1){a,v -> lcm(a,v)}
    fun gcd(x : Int, y :Int) : Int {
        var a = x
        var b = y
        while(b != 0) {
            var r = a % b
            a = b
            b = r
        }
        return a
    }
    fun lcm(x : Int, y : Int) : Int {
        return x*y/gcd(x,y)
    }
}