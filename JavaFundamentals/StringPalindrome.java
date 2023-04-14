package JavaFundamentals;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        // Your code goes here
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(isPalindrome(str));
        }
    }
}
