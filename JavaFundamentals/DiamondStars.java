
//print the following pattern
//for example, if the user enters n = 5, the output should be:
//    *
//   ***
//  *****
//   ***
//    *
// and n is the number of rows and always an odd number
package JavaFundamentals;
import java.util.Scanner;


public class DiamondStars {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            int j = 1;
            int k = i;
            int l = n/2;
            while (i <= n) {
                if(i <= l){
                while (k < l) {
                    System.out.print(" ");
                    k++;
                }
                j = 1;
                while (j <= (i*2) + 1) {
                    System.out.print("*");
                    j++;
                }
                    System.out.print("\n");
                }
                else{
                    while(k>l){
                        System.out.print(" ");
                        k--;
                    }
                    j = (n*2)-1;
                    while(j>=(i*2)){
                        System.out.print("*");
                        j--;
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}