package JavaFundamentals;

import java.util.Scanner;

public class Sort01 {
    public static void sort01(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
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
                sort01(arr);
                System.out.println("The sorted array is: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                t--;
            }
        }
    }
}
