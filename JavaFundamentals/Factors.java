//Write a program to print all the factors of a number other than 1 and the number itself.
//
package JavaFundamentals;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        try (// Write your code here
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    if (i != n) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}


// import java.util.Scanner;

// public class Factors {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int number = s.nextInt();
//         int i = 2;
//         while (i < number) {
//             if (number % i == 0) {
//                 System.out.println(i);
//                 i = i+1;
//             }
//             i = i+1;
//         }
//     }
// }

