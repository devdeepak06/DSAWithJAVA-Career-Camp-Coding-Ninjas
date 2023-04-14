package JavaFundamentals;

import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int base = scan.nextInt();
            int exponent = scan.nextInt();
            long result = 1;
            while (exponent != 0) {
                result = result * base;
                exponent = exponent - 1;
            }

            System.out.println("Answer = " + result);
        }
    }
}
