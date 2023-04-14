package JavaFundamentals;

import java.util.Scanner;

public class SumofTwoArrays {
    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int carry = 0;
        while (k >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }
            int digit = sum % 10;
            carry = sum / 10;
            output[k] = digit;
            i--;
            j--;
            k--;
        }

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n1 = s.nextInt();
                int[] arr1 = new int[n1];
                for (int i = 0; i < n1; i++) {
                    arr1[i] = s.nextInt();
                }
                int n2 = s.nextInt();
                int[] arr2 = new int[n2];
                for (int i = 0; i < n2; i++) {
                    arr2[i] = s.nextInt();
                }
                int n3 = (n1 > n2) ? n1 + 1 : n2 + 1;
                int[] output = new int[n3];
                sumOfTwoArrays(arr1, arr2, output);
                for (int i = 0; i < n3; i++) {
                    System.out.print(output[i] + " ");
                }
                t--;
            }
        }
    }

}
