class Solution {
    fun solution(w: Int, h: Int): Long {
        val width = w.toLong()
        val height = h.toLong()

        var unUsableRanctangle = width + height - gcd(width, height)
        
        return  width*height-unUsableRanctangle
    }
    fun gcd(a: Long, b: Long): Long {
        if(b == 0L) return a;
        return gcd(b, a%b);
    }
}