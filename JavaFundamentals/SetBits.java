package JavaFundamentals;

import java.util.Scanner;

public class SetBits {
    public static int countSetBits(int n) {
        // Your code goes here
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(countSetBits(n));
        }
    }
}
