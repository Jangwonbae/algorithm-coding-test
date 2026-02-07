import java.util.Scanner;
import java.util.stream.IntStream;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(e -> sb.append("*"));
        IntStream.range(0, b).forEach(e -> System.out.println(sb.toString()));
       
    }
}