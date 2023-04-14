//First Index of Element
package JavaFundamentals;

import java.util.Scanner;

public class FirstIdxOfElement {

    public static int firstIndex(int input[], int x) {
        // Write your code here
        int n = input.length;
        if (n == 0) {
            return -1;
        }
        if (input[0] == x) {
            return 0;
        }
        int[] smallInput = new int[n - 1];
        for (int i = 1; i < n; i++) {
            smallInput[i - 1] = input[i];
        }
        int smallAns = firstIndex(smallInput, x);
        if (smallAns == -1) {
            return -1;
        } else {
            return smallAns + 1;
        }
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(firstIndex(input, x));
    }
}
