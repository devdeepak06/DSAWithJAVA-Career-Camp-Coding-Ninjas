package JavaFundamentals;

import java.util.Scanner;

public class InvertedNumTriangle {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int rows = 1;
            while (rows <= n) {
                int spaces = 1;
                while (spaces <= n - rows + 1) {
                    System.out.print(n - rows + 1);
                    spaces = spaces + 1;
                }
                System.out.println();
                rows = rows + 1;
            }
        }
    }
}