    // write a program that converts a binary number to a decimal number
    //
    // Input Format:
    // Integer n
    //
    // Constraints:
    // 0 <= n <= 1000000000
    //
    // Output Format
    // Decimal number
    //
    // Sample Input
    // 1100
    // Sample Output
    // 12
    // Explanation
    // For the given input, you have to print the decimal equivalent of it. Hence, 12.
    //
    // Sample Input
    // 111
    // Sample Output
    // 7
    // Explanation
    // For the given input, you have to print the decimal equivalent of it. Hence, 7.
    //
package JavaFundamentals;
import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int dec = 0;
            int pow = 0;
            while (n > 0) {
                int rem = n % 10;
                dec = dec + rem * (int)Math.pow(2, pow);
                pow++;
                n = n / 10;
            }
            System.out.println(dec);
        }
    }
    
    
}
