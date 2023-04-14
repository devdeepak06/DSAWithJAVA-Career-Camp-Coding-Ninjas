package JavaFundamentals;

import java.util.Scanner;

public class RemoveCharacter {

    public static String removeChar(String str, char ch) {
        // Your code goes here
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            char ch = s.next().charAt(0);
            System.out.println(removeChar(str, ch));
        }
    }
}
