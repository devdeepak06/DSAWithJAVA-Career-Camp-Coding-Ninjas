package Recursion;

public class CheckAB {
    public static boolean checkAB(String input) {
        if (input.length() == 0) {
            return true;
        }
        if (input.charAt(0) == 'a') {
            if (input.length() >= 3 && input.substring(1, 3).equals("bb")) {
                return checkAB(input.substring(3));
            }
            return checkAB(input.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abbabb";
        System.out.println(checkAB(s));
    }
}
