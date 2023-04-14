package JavaFundamentals;

import java.util.Scanner;

public class HighestOccuringCharacter {
    public static char highestOccuringCharacter(String str) {
        int[] count = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(highestOccuringCharacter(str));
        }
    }
}
