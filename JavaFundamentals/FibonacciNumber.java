//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//F(n) = F(n-1) + F(n-2)
//Input Format :
//Integer N
//Output Format :
//true or false
//Sample Input 1 :
//5
//Sample Output 1 :
//true
//Sample Input 2 :
//14
//Sample Output 2 :
//false


package JavaFundamentals;
import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n) {
        // Write your code here
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
        
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                System.out.println(fibonacciNumber(n));
                t--;
            }
        }
    }
}
