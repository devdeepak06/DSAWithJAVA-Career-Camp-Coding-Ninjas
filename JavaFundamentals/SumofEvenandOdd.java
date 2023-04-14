//Sum of all its even digits and all odd digits separately
//
//
package JavaFundamentals;

import java.util.Scanner;

public class SumofEvenandOdd {
    public static int sumOfEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                sum += rem;
            }
            n /= 10;
        }
        return sum;
    }

    public static int sumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                sum += rem;
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the number: ");
                int n = s.nextInt();
                System.out.println(sumOfEvenDigits(n) + "\t" + sumOfOddDigits(n));
                // System.out.println("The sum of all even digits in " + n + " is: " +
                // sumOfEvenDigits(n));
                // System.out.println("The sum of all odd digits in " + n + " is: " +
                // sumOfOddDigits(n));
                t--;
            }
        }
    }
}
