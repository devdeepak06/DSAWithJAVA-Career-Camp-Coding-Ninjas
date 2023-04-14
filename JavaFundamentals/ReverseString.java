package JavaFundamentals;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        // Your code goes here
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(reverse(str));
        }
    }
}
