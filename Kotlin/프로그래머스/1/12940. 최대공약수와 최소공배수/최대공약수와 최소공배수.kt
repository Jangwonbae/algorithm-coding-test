class Solution {//유클리드 호제법
    fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n,m), lcm(n,m))
    fun gcd(x : Int, y : Int) : Int {//최대 공약수 gcd : a%b == 0 이 될 때 까지 a=b, b=a%b (치환필요)
        var a = x
        var b = y
        var r = 0
        while(a%b != 0) {
            r=a
            a=b
            b=r%b
        }
        return b
    }
    fun lcm(x : Int, y: Int) : Int {//최소 공배수 lcm : a*b/gcd(a,b) (a,b곱을 최대 공약수로 나눔)
        return x*y/gcd(x,y)
    }
}