package JavaFundamentals;

import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        // Your code goes here
        String ans = "";
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans += reverse(str.substring(0, i)) + " ";
                str = str.substring(i + 1, str.length());
                i = 0;
            }
        }
        return ans + reverse(str);

    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(reverseEachWord(str));
        }
    }
}
