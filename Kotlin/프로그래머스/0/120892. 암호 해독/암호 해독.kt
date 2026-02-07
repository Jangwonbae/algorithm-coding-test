class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed{i,_ -> (i+1)%code==0}
}