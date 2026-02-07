import kotlin.math.pow
class Solution {
    fun solution(n: Int): Int = if(n%2==1) (1..n).filter{it%2==1}.sum() 
    else (1..n).filter{it%2==0}.fold(0){a,v -> a+v*v}
}