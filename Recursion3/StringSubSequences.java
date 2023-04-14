public class StringSubSequences {
    // Retrun Subsequences of a String
    public static String[] subsequences(String input) {
        if (input.length() == 0) {
            // base case
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        // small calculation
        String[] smallOutput = subsequences(input.substring(1));
        String[] output = new String[2 * smallOutput.length];
        // copying the elements of smallOutput to output
        for (int i = 0; i < smallOutput.length; i++) {
            output[i] = smallOutput[i];
        }
        // adding the first character of input to the elements of smallOutput
        for (int i = 0; i < smallOutput.length; i++) {
            output[i + smallOutput.length] = input.charAt(0) + smallOutput[i];
        }
        return output;
    }

    // printSubsequences
    public static void printSubsequences(String input, String stringSoFar) {
        // Base Case
        if (input.length() == 0) {
            System.out.println(stringSoFar);
            return;
        }
        // Small Calculation
        String smallOutput = input.substring(1);
        // Recursive Call
        printSubsequences(smallOutput, stringSoFar);
        printSubsequences(smallOutput, stringSoFar + input.charAt(0));
    }

    public static void main(String[] args) {
        String str = "abc";
        // printSubSequences(str, "");
        // String[] output = subsequences(str);
        // for (int i = 0; i < output.length; i++) {
        //     System.out.println(output[i]);
        // }
        printSubsequences(str, "");

    }
}