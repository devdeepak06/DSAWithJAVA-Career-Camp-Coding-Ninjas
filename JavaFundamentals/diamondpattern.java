//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * *
// * * * 
//  * *
//   *
package JavaFundamentals;
import java.util.Scanner;
public class diamondpattern {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = s.nextInt();
            int number = 1;
            while(number <= rows)
            {
                int count = 1;
                while(count <= rows - number)
                {
                    System.out.print(" ");
                    count++;
                }
                count = 1;
                while(count <= number)
                {
                    System.out.print("* ");
                    count++;
                }
                System.out.println();
                number++;
            }
            number = rows - 1;
            while(number >= 1)
            {
                int count = 1;
                while(count <= rows - number)
                {
                    System.out.print(" ");
                    count++;
                }
                count = 1;
                while(count <= number)
                {
                    System.out.print("* ");
                    count++;
                }
                System.out.println();
                number--;
            }
        }
        
    }
}
