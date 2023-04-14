package JavaFundamentals;

import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            System.out.println("Enter the size of the first array");
            int n1 = s.nextInt();
            System.out.println("Enter the elements of the first array");
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr1[i] = s.nextInt();
            }
            System.out.println("Enter the size of the second array");
            int n2 = s.nextInt();
            System.out.println("Enter the elements of the second array");
            int[] arr2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                arr2[i] = s.nextInt();
            }
            int[] arr3 = mergeTwoSortedArray(arr1, arr2);
            printArray(arr3);
        }
    }
}
