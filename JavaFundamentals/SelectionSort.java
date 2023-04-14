package JavaFundamentals;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
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
                for (int i = 0; i < arr.length; i++) {

                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                t--;
            }
        }
    }
}
