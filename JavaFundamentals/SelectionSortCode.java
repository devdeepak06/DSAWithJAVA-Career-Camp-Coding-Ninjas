package JavaFundamentals;

import java.util.Scanner;

public class SelectionSortCode {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the size of the array");
                int n = s.nextInt();
                System.out.println("Enter the elements of the array");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                selectionSort(arr); // Call the selectionSort method here to sort the array arr in ascending order
                System.out.println("The sorted array is");
                printArray(arr);
                t--;
            }
        }
    }
}
