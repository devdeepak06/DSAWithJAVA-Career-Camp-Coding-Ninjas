public class ReturnKeypad {
    // getOptions
    public static String[] getOptions(int n) {
        if (n == 1) {
            String[] output = { "^", "/", ":", ";", "(", ")", "$", "&", "@", "!" };
            return output;
        } else if (n == 2) {
            String[] output = { "a", "b", "c" };
            return output;
        } else if (n == 3) {
            String[] output = { "d", "e", "f" };
            return output;
        } else if (n == 4) {
            String[] output = { "g", "h", "i" };
            return output;
        } else if (n == 5) {
            String[] output = { "j", "k", "l" };
            return output;
        } else if (n == 6) {
            String[] output = { "m", "n", "o" };
            return output;
        } else if (n == 7) {
            String[] output = { "p", "q", "r", "s" };
            return output;
        } else if (n == 8) {
            String[] output = { "t", "u", "v" };
            return output;
        } else if (n == 9) {
            String[] output = { "w", "x", "y", "z" };
            return output;
        } else {
            String[] output = { "" };
            return output;
        }
    }

    public static String[] keypad(int n) {
        // Base Case
        if (n == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        // Recursive Case
        String[] smallOutput = keypad(n / 10);
        int lastDigit = n % 10;
        String[] lastDigitOption = getOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOption.length];
        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            for (int j = 0; j < lastDigitOption.length; j++) {
                output[k] = smallOutput[i] + lastDigitOption[j];
                k++;
            }
        }
        return output;
    }

    public static void printKeypad(int input) {
        printKeypadHelper(input, "  ");

    }

    public static void printKeypadHelper(int n, String stringSoFar) {
        // Base Case
        if (n == 0) {
            System.out.println(stringSoFar);
            return;
        }
        // Small Calculation
        int lastDigit = n % 10;
        String[] lastDigitOption = getOptions(lastDigit);
        int smallOutput = n / 10;
        // Recursive Call
        for (int i = 0; i < lastDigitOption.length; i++) {
            printKeypadHelper(smallOutput, lastDigitOption[i] + stringSoFar);
        }

    }

    public static void main(String[] args) {
        int n1 = 23;
        // String[] output = keypad(n);
        // for (int i = 0; i < output.length; i++) {
        // System.out.println(output[i]);
        // }
        printKeypad(n1);
        System.out.println();

    }
}