public class MinimumInArray {
    // min for minimum in array
    public static int min(int[] input, int startIndex) {
        // Base Case
        if (startIndex == input.length - 1) {
            return input[startIndex];
        }
        // Recursive Case
        int smallAns = min(input, startIndex + 1);
        if (input[startIndex] < smallAns) {
            return input[startIndex];
        } else {
            return smallAns;
        }
    }
    // printMin for  minimum in array
    public static void printMin(int[] input, int startIndex, int minSoFar) {
        // Base Case
        if (startIndex == input.length) {
            System.out.println(minSoFar);
            return;
        }
        // Recursive Case
        if (input[startIndex] < minSoFar) {
            minSoFar = input[startIndex];
        }
        printMin(input, startIndex + 1, minSoFar);
    }

    public static void main(String[] args) {
        int[] input = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int min = min(input, 0);
        // System.out.println(min);
        printMin(input, 0, Integer.MAX_VALUE);
    }
}