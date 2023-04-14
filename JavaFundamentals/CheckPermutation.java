package JavaFundamentals;

import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128];
        char[] s_array = str1.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first string: ");
            String str1 = sc.nextLine();
            System.out.println("Enter the second string: ");
            String str2 = sc.nextLine();
            if (isPermutation(str1, str2)) {
                System.out.println("The strings are permutations of each other.");
            } else {
                System.out.println("The strings are not permutations of each other.");
            }
        }
    }
}
