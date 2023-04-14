//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//
//Input Format:
//Constraints:
//0 <= N < 1000000000
//
//Output Format
//Sample Input
//1234
//Sample Output
//4321
//Explanation
//For the given input, you have to print the reverse of it. Hence, 4321.

package JavaFundamentals;

import java.util.Scanner;

public class ReverseofaNumber {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int rev = 0;
            while (n > 0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }

}
