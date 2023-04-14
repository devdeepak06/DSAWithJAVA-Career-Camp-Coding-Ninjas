// Print the star pattern
// 1234554321
// 1234**4321   
// 123****321
// 12******21
// 1********1

package JavaFundamentals;

import java.util.Scanner;

public class NumberStarPattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(j);
                }
                for (int k = 1; k <= 2 * i - 2; k++) {
                    System.out.print("*");
                }
                for (int l = n - i + 1; l >= 1; l--) {
                    System.out.print(l);
                }
                System.out.println();
            }
            // int i = 1;
            // while (i <= n) {
            // int j = 1;
            // while (j <= n - i + 1) {
            // System.out.print(j);
            // j++;
            // }
            // int k = 1;
            // while (k <= 2 * i - 2) {
            // System.out.print("*");
            // k++;
            // }
            // int l = n - i + 1;
            // while (l >= 1) {
            // System.out.print(l);
            // l--;
            // }
            // System.out.println();
            // i++;
            // }
        }
    }
}
