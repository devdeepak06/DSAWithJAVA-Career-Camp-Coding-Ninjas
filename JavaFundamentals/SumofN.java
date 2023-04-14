package JavaFundamentals;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            int sum = 0;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
