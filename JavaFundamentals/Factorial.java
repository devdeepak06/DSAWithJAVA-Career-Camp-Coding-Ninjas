package JavaFundamentals;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        if(n >= 0){
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
    }
    else{
        System.out.println("Error");
    }
    return fact;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while(t > 0) {
                System.out.println("Enter the number: ");
                int n = s.nextInt();
                System.out.println("The factorial of " + n + " is: " + factorial(n));
                t--;
            }
        }
    }
    
}
