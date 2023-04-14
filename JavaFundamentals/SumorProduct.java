// Purpose: To calculate the sum or product of a series of numbers
//
// Input: The user will input a number n and a character c
//
// Output: The sum or product of the numbers from 1 to n
//
// Example: If the user inputs 10 and 1, the output will be 55
//          If the user inputs 10 and 2, the output will be 3628800
//
// Algorithm:
// 1. Get the user input
// 2. Calculate the sum or product of the numbers from 1 to n
// 3. Print the result
package JavaFundamentals;

import java.util.Scanner;

public class SumorProduct {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int c = s.nextInt();
            int sum = 0;
            int product = 1;
            if (c == 1) {
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println(sum);
            } else if (c == 2) {
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                System.out.println(product);
            } else {
                System.out.println("-1");
            }
        }
    }

}
