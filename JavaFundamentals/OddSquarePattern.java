//print the odd square pattern using while loop
//for example, if the user enters n = 4, the output should be:
// 1357
// 3579
// 5791
// 7913
package JavaFundamentals;


import java.util.Scanner;

public class OddSquarePattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 1;
            int j = 1;
            while (i <= n) {
                int odd = 2 * i - 1;
                j = n;
                while (j >= i) {
                    System.out.print(odd);
                    odd = odd + 2;
                    j--;
                }
                j = 1;
                int k = 1;
                while (j <= i - 1) {

                    System.out.print(k);
                    k = k + 2;
                    j++;
                }
                System.out.println();
                i++;

            }
        }

    }

}
