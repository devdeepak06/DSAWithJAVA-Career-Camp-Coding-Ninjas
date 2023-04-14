package JavaFundamentals;

import java.util.Scanner;

public class MaximiseTheSum {

    public static long maxSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0, sum = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else {
                sum += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }

        }
        while (i < arr1.length) {
            sum1 += arr1[i];
            i++;
        }
        while (j < arr2.length) {
            sum2 += arr2[j];
            j++;
        }
        sum += Math.max(sum1, sum2);
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = s.nextInt();
            }
            int m = s.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = s.nextInt();
            }
            System.out.println(maxSum(arr1, arr2));
        }
    }
}
