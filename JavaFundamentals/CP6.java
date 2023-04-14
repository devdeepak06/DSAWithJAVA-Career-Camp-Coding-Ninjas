// print interesting pattern
//Sample Input 1
//3
//Sample Output 1
//C
//BC
//ABC
package JavaFundamentals;

import java.util.Scanner;
public class CP6 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while(i<=n){
                int j = 1;
                while(j<=n){
                    char jthChar = (char)('A' + n - j);
                    System.out.print(jthChar);
                    j = j +1;
                }
                System.out.println();
                i = i +1;
            }
        }
    }
}