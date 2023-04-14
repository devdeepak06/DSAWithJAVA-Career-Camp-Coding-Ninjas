//Given an array/list(ARR) of integers and a position 'm'. You have to reverse the array after that position.
//Sample Input 1:
//1
//6 3
//1 2 3 4 5 6
//Sample Output 1:
//1 2 3 4 6 5
//Sample Input 2:
//2
//6 3
//1 2 3 4 5 6
//5 2
//10 9 8 7 6
//Sample Output 2:
//1 2 3 4 6 5
//10 9 8 6 7
package JavaFundamentals;

import java.util.Scanner;

public class ReverseTheArray {
    public static void reverse(int[] arr, int m) {
        // Write your code here
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (i < m) {
                arr[i] = temp[i];
            } else {
                arr[i] = temp[n - i + m - 1];
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int m = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                reverse(arr, m);
                printArray(arr);
                t--;
            }
        }
    }
}