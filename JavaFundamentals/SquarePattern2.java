package JavaFundamentals;

import java.util.Scanner;

public class SquarePattern2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n) {
                    System.out.print(j);
                    j = j + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }
    }
}
