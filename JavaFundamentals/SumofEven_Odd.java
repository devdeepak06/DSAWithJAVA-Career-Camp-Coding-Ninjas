package JavaFundamentals;

import java.util.Scanner;

public class SumofEven_Odd {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int sumEven = 0;
            int sumOdd = 0;
            while (n != 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
                n /= 10;
            }
            System.out.println(sumEven + " " + sumOdd);
        }
    }
}