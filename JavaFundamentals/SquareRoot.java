// Given a number, find its square root in integer.
//
// Input Format:
// Constraints:
// 0 <= N < 1000000000
//
// Output Format
// Sample Input
// 10
// Sample Output
// 3
// Explanation
// For the given input, you have to print the square root of it. Hence, 3.
//
// Sample Input
// 4
// Sample Output
// 2
// Explanation
// For the given input, you have to print the square root of it. Hence, 2.
//
package JavaFundamentals;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i * i <= n) {
                i++;
            }
            System.out.println(i - 1);
        }
    }

}
