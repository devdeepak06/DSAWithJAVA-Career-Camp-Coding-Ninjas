package JavaFundamentals;

import java.util.Scanner;

public class FindTripletSum {

    public static int findTripletSum(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
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
                System.out.println("Enter the sum: ");
                int x = s.nextInt();
                System.out.println("The number of triplets with sum " + x + " is: " + findTripletSum(arr, x));
                t--;
            }
        }
    }
}
