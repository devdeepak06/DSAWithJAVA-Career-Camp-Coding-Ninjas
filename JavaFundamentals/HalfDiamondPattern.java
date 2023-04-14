//Print the following pattern using while loop
//    *
//    *1*
//    *121*
//    *12321*
//    *1234321*
//    *123454321*
//    *1234321*
//    *12321*
//    *121*
//    *1*
//    *
package JavaFundamentals;

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                int k = i - 1;
                while (k >= 1) {
                    System.out.print(k);
                    k--;
                }

                System.out.println();
                i++;
            }
            i = n - 1;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                j = j - 1;
                while (j >= 1) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i--;
            }
        }
    }
}