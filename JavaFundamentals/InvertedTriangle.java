package JavaFundamentals;
 
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while(i <= n){
                int spaces = 1;
                while(spaces <= n - i + 1){
                    System.out.print('*');
                    spaces = spaces + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }
    }
}