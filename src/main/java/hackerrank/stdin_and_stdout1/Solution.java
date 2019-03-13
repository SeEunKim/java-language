package hackerrank.stdin_and_stdout1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int b = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int c = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
