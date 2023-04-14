// print the Parallelogram pattern
// for example, if the user enters n = 5, the output should be:
// *****
//  *****
//   *****
//    *****
//     *****
// and n is the number of rows
package JavaFundamentals;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        int i, j, k;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
