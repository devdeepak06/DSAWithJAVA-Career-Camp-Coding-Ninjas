// We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.

//Input format:
//A 4 digit number
//
//Output format:
// A 3 digit number

// Sample input 1
// 5438
//Sample output 1
//548
package JavaFundamentals;

import java.util.Scanner;

public class MaximumNumber {
    public static int max_number(int n) {
        int max_number = 0;
        int i = 1;
        while (n / i > 0) {
            int temp = (n / (i * 10)) * i + (n % i);
            // System.out.println(temp);
            if (temp > max_number) {
                max_number = temp;
            }
            i *= 10;
        }
        return max_number;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(max_number(n));
        }

    }

}
