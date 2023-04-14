// write a program to print first x terms of series 3N + 2 which are not multiples of 4.
//
// Input Format:
// Integer x
//
// Constraints:
// 1 <= x <= 1000
//
// Output Format
// Terms of series (separated by space)
//
// Sample Input
// 10
// Sample Output
// 5 11 14 17 23 26 29 35 38 41
// Explanation
// First ten terms which are not divisible by 4 in the given series are 5, 11, 14, 17, 23, 26, 29, 35, 38, 41.
package JavaFundamentals;

import java.util.Scanner;

public class TermsofSeries {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            int count = 0;
            while (count < n) {
                int term = 3 * i + 2;
                if (term % 4 != 0) {
                    System.out.print(term + " ");
                    count++;
                }
                i++;
            }
        }
    }
}
