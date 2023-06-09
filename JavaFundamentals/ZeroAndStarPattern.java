/*Zeros and Stars Pattern

Print the following pattern
Pattern for N = 4

*000*000*
0*00*00*0
00*0*0*00
000***000

Input Format :

N (Total no. of rows)

Output Format :

Pattern in N lines

Sample Input 1 :

3

Sample Output 1 :

*00*00*
0*0*0*0
00***00

Sample Input 2 :

5

Sample Output 2 :

*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000

*/
package JavaFundamentals;

import java.util.Scanner;

public class ZeroAndStarPattern {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n, i, j;
            n = s.nextInt();
            for (i = n; i > 0; i--) {
                for (j = 1; j <= n - i; j++)
                    System.out.print("0");
                System.out.print("*");
                for (j = i - 1; j > 0; j--)
                    System.out.print("0");
                System.out.print("*");
                for (j = i - 1; j > 0; j--)
                    System.out.print("0");
                System.out.print("*");
                for (j = 1; j <= n - i; j++)
                    System.out.print("0");
                System.out.println();
            }
        }
    }
}
