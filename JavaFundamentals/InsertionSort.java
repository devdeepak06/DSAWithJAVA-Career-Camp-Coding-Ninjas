package JavaFundamentals;

import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases");
            int t = sc.nextInt();
            while (t > 0) {
                System.out.println("Enter the size of the array");
                int n = sc.nextInt();
                System.out.println("Enter the elements of the array");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                insertionSort(arr);
                System.out.println("The sorted array is");
                printArray(arr);
                t--;
            }
        }
    }
}
