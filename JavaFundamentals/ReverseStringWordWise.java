package JavaFundamentals;

import java.util.Scanner;

public class ReverseStringWordWise {

    public static String reverseWordWise(String str) {
        // Your code goes here
        String ans = "";
        int i = str.length() - 1;
        for (; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                ans += str.substring(i + 1, str.length()) + " ";
                str = str.substring(0, i);
            }
        }
        ans += str;
        return ans;

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(reverseWordWise(str));
        }
    }
}
