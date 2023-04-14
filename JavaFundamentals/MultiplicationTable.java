package JavaFundamentals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= 10) {
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
                i++;
            }
        }

    }
}
