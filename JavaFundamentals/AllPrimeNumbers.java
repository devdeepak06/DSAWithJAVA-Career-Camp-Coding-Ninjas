//print all n prime numbers from 2 to n
package JavaFundamentals;
import java.util.Scanner;
public class AllPrimeNumbers {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Main Method is used

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

    }
    
}
