package JavaFundamentals;

import java.util.Scanner;

public class HDVn {
    public static void main(String[] args) {
        try (// Write your code here
                Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("*");
            // one half
            for (int i = 1; i <= n; i++) {
                int j = 1;
                System.out.print("*");
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                j--;

                while (--j >= 1) {

                    System.out.print(j);
                }
                System.out.println("*");
            }
            // other half
            for (int i = n - 1; i >= 1; i--) {
                int j = 1;
                System.out.print("*");
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                j--;

                while (--j >= 1) {
                    System.out.print(j);
                }
                System.out.println("*");
            }
        }
        System.out.println("*");

    }
}
