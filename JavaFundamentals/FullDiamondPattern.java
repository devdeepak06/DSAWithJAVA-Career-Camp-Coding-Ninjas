// print the following pattern using while loop
//      *
//     *1*
//    *121*
//   *12321*
//  *1234321*
// *123454321*
//  *1234321*
//   *12321*
//    *121*
//     *1*
//      *

package JavaFundamentals;

import java.util.Scanner;

public class FullDiamondPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = 1;
                while (k <= i) {
                    System.out.print(k);
                    k++;
                }
                int l = i - 1;
                while (l >= 1) {
                    System.out.print(l);
                    l--;
                }
                System.out.println();
                i++;
            }
            int p = n - 1;
            while (p >= 1) {
                int q = 1;
                while (q <= n - p) {
                    System.out.print(" ");
                    q++;
                }
                int r = 1;
                while (r <= p) {
                    System.out.print(r);
                    r++;
                }
                int s = p - 1;
                while (s >= 1) {
                    System.out.print(s);
                    s--;
                }
                System.out.println();
                p--;
            }
        }

    }
}
