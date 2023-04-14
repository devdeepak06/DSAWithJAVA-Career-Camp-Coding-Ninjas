//Sum of even number till N
package JavaFundamentals;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static int sumOfEvenNumber(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the number till which you want to find the sum of even numbers: ");
                int n = s.nextInt();
                System.out.println("The sum of even numbers till " + n + " is: " + sumOfEvenNumber(n));
                t--;
            }
        }
    }
}