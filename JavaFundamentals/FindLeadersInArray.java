package JavaFundamentals;

import java.util.Scanner;

public class FindLeadersInArray {
    public static void leaders(int[] arr) {
        int max = arr[arr.length - 1];
        System.out.print(max + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            leaders(arr);
        }
    }
}
