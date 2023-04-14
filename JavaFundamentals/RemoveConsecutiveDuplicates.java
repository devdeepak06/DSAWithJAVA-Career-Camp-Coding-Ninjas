package JavaFundamentals;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        if (str.length() == 0) {
            return str;
        }
        String output = "";
        output += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                output += str.charAt(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string: ");
            String str = sc.nextLine();
            System.out.println(removeConsecutiveDuplicates(str));
        }
    }
}
