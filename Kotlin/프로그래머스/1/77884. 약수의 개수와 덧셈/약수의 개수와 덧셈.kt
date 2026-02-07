class Solution {
    fun solution(left: Int, right: Int): Int = (left..right).sumOf{
        (1..it).toList().filter{a -> it%a==0}.count().let{b->
            if(b%2==0) it else -1*it
        }
    }
}