package JavaFundamentals;

import java.util.Scanner;

public class SquarePattern4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = input.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n) {
                    System.out.print(n);
                    j = j + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }

    }

}
