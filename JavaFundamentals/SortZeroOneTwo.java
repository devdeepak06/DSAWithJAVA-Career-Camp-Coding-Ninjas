package JavaFundamentals;

import java.util.Scanner;

public class SortZeroOneTwo {
    public static void sort012(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (j <= k) {
            if (arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sort012(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
