package JavaFundamentals;

import java.util.Scanner;

public class FindUnique {
    public static int findUnique(int[] arr) {
        int n = arr.length;
        int unique = 0;
        for (int i = 0; i < n; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
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
                int unique = findUnique(arr);
                System.out.println("The unique element in the array is: " + unique);
                t--;
            }
        }
    }
}