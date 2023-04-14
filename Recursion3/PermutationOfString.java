public class PermutationOfString {
    public static String[] permutationOfStrings(String input) {
        // Base Case
        if (input.length() == 0) {
            String[] output = { "" };
            return output;
        }
        // Recursive Case
        String[] smallOutput = permutationOfStrings(input.substring(1));
        String[] output = new String[input.length() * smallOutput.length];
        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            for (int j = 0; j <= smallOutput[i].length(); j++) {
                output[k] = smallOutput[i].substring(0, j) + input.charAt(0) + smallOutput[i].substring(j);
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "abc";
        String[] output = permutationOfStrings(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
