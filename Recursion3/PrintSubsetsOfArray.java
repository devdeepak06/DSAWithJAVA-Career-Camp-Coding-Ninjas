public class PrintSubsetsOfArray {
    public static int[][] subsets(int input[]) {
        // Write your code here
        // Base Case
        if (input.length == 0) {
            int[][] output = new int[1][0];
            return output;
        }
        // Small Calculation
        int[] smallInput = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        // Recursive Call
        int[][] smallOutput = subsets(smallInput);
        int[][] output = new int[2 * smallOutput.length][];
        // Copying the elements of smallOutput to output
        for (int i = 0; i < smallOutput.length; i++) {
            output[i] = new int[smallOutput[i].length];
            for (int j = 0; j < smallOutput[i].length; j++) {
                output[i][j] = smallOutput[i][j];
            }
        }
        // Adding the first element of input to the elements of smallOutput
        for (int i = 0; i < smallOutput.length; i++) {
            output[i + smallOutput.length] = new int[smallOutput[i].length + 1];
            output[i + smallOutput.length][0] = input[0];
            for (int j = 1; j < output[i + smallOutput.length].length; j++) {
                output[i + smallOutput.length][j] = smallOutput[i][j - 1];
            }
        }
        return output;
    }

    public static void printSubsets(int input[]) {
        int[][] output = subsets(input);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] input = { 15, 20, 12 };
        printSubsets(input);
    }
}