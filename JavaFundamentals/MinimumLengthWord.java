package JavaFundamentals;

import java.util.Scanner;
public class MinimumLengthWord {
    
    public static String minLengthWord(String input) {
        String[] words = input.split(" ");
        int min = words[0].length();
        String minWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min) {
                min = words[i].length();
                minWord = words[i];
            }
        }
        return minWord;
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String input = s.nextLine();
            System.out.println(minLengthWord(input));
        }
    }
}
