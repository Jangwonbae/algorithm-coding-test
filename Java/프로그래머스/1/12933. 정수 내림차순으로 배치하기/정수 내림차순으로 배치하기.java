import java.util.stream.Stream;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer=0;
        String a[] = Long.toString(n).split("");
        long[] newArr = Stream.of(a).mapToLong(Long::parseLong).toArray();
        Arrays.sort(newArr);
        String ss="";
        for(int i=newArr.length-1;i>-1;i--){
            ss+=newArr[i];
        }
        return Long.parseLong(ss);
    }
}