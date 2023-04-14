package JavaFundamentals;

import java.util.Scanner;

public class IntersectionofTwoArray {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int N = arr1.length;
        int M = arr2.length;
        int[] arr3 = new int[N + M];

        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr1[i] == arr2[j]) {

                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }
        return arr3;
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
                System.out.println("Enter the size of first array for test case: ");
                int N = s.nextInt();
                System.out.println("Enter the elements of first array: ");
                int[] arr1 = new int[N];
                for (int i = 0; i < N; i++) {
                    arr1[i] = s.nextInt();
                }
                System.out.println("Enter the size of second array for test case: ");
                int M = s.nextInt();
                System.out.println("Enter the elements of second array: ");
                int[] arr2 = new int[M];
                for (int i = 0; i < M; i++) {
                    arr2[i] = s.nextInt();
                }
                int[] arr3 = intersection(arr1, arr2);
                System.out.println("The intersection of the two arrays is: ");
                printArray(arr3);
                t--;
            }
        }
    }
}