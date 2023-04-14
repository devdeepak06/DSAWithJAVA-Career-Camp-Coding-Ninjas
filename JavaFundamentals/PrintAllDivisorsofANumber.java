package JavaFundamentals;

import java.util.Scanner;

public class PrintAllDivisorsofANumber {
    public void printDivisors(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String args[]) {
        PrintAllDivisorsofANumber obj = new PrintAllDivisorsofANumber();
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            obj.printDivisors(n);
        }
    }
}