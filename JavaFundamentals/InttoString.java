//You are given an integer n, you have to convert it into a string.
//Please complete the partially completed code in the editor. If your code successfully converts n into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//n can range between -100 to 100 inclusive.
//Sample Input
//100
//Sample Output
//Good job
package JavaFundamentals;

import java.util.Scanner;

public class InttoString {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n >= -100 && n <= 100) {
                String s = String.valueOf(n);
                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            }
        }
    }
}