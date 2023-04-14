package JavaFundamentals;

import java.util.Scanner;

public class SwapAlternate {
    public static void swapAlternate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the size of array for test case: ");
                int n = s.nextInt();
                System.out.println("Enter the elements of array: ");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                swapAlternate(arr);
                System.out.println("The array after swapping alternate elements is: ");
                printArray(arr);
                t--;
            }
        }
    }
}