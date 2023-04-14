package JavaFundamentals;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int temp = n;
            int rev = 0;
            while (temp > 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (n == rev) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
