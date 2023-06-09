//We use the integers a, b, and n to create the following series:
//  a+2^0*b, a+2^0*b+2^1*b, a+2^0*b+2^1*b+2^2*b, ... , a+2^0*b+2^1*b+...+2^(n-1)*b
// You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
// Input Format
// The first line contains an integer, q, denoting the number of queries.
// Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.
// Constraints
// 0 <= q <= 500
// 0 <= a, b <= 50
// 1 <= n <= 15
// Output Format
// For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
// Sample Input
// 2
// 0 2 10
// 5 3 5
// Sample Output
// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98
// Explanation
// We have two queries:
// 1. We use a = 0, b = 2, and n = 10 to produce some series s = s0, s1, ..., s9:
// s0 = 0 + 1*2 = 2
// s1 = 0 + 1*2 + 2*2 = 6
// s2 = 0 + 1*2 + 2*2 + 4*2 = 14
// s3 = 0 + 1*2 + 2*2 + 4*2 + 8*2 = 30
// s4 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 = 62
// s5 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 + 32*2 = 126
// s6 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 + 32*2 + 64*2 = 254
// s7 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 + 32*2 + 64*2 + 128*2 = 510
// s8 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 + 32*2 + 64*2 + 128*2 + 256*2 = 1022
// s9 = 0 + 1*2 + 2*2 + 4*2 + 8*2 + 16*2 + 32*2 + 64*2 + 128*2 + 256*2 + 512*2 = 2046
// We then print each element of our series as a single line of space-separated values.
// 2. We use a = 5, b = 3, and n = 5 to produce some series s = s0, s1, ..., s4:
// s0 = 5 + 1*3 = 8
// s1 = 5 + 1*3 + 2*3 = 14
// s2 = 5 + 1*3 + 2*3 + 4*3 = 26
// s3 = 5 + 1*3 + 2*3 + 4*3 + 8*3 = 50
// s4 = 5 + 1*3 + 2*3 + 4*3 + 8*3 + 16*3 = 98
// We then print each element of our series as a single line of space-separated values.

package JavaFundamentals;

import java.util.Scanner;
import java.lang.Math;

public class Loop2 {
    public static void series(int a, int b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i) * b;
            System.out.print(a + sum + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of queries: ");
            int t = in.nextInt();
            while (t > 0) {
                for (int i = 0; i < t; i++) {
                    System.out.println("Enter the values of a: ");
                    int a = in.nextInt();
                    System.out.println("Enter the values of b: ");
                    int b = in.nextInt();
                    System.out.println("Enter the values of n: ");
                    int n = in.nextInt();
                    series(a, b, n);
                    t--;
                }
            }
        }
    }
}