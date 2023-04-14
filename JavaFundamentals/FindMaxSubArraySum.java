//You are given an integer array, arr, of size N and a positive integer K. Out of all subarrays of 'arr' of size K, find the sum of the subarray that has the maximum sum.

//Input Format

//The first line of input contains a single integer, N, denoting the size of the array. The second line of input contains a single integer, K, denoting the size of the subarray. The third line of input contains N space-separated integers, denoting the elements of the array.

//Output Format

//Print a single integer denoting the sum of the subarray that has the maximum sum.

//Sample Input

//6 2

//2 7 3 6 7 7

//Sample Output

//14
package JavaFundamentals;

import java.util.Scanner;

public class FindMaxSubArraySum {

    public static int findMaxSubArraySum(int[] arr, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < k + i + 1 && k + i < arr.length; j++) {
                sum += arr[j];
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(findMaxSubArraySum(arr, k));
        }
    }
}

// import java.util.Scanner;
// public class FindMaxSubArraySum {

// public static void main(String[] args) {
// // Write your code here
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt();
// int k = scanner.nextInt();
// int[] arr = new int[n];
// for (int i=0;i< arr.length;i++){
// arr[i]=scanner.nextInt();
// }
// int sum=0,max=Integer.MIN_VALUE;
// for (int i=0;i<n;i++) {
// for (int j = i+1; j < k+i+1 && k+i<n; j++) {
// sum += arr[j];
// }
// if (sum>max) max=sum;
// sum=0;
// }

// System.out.println(max);
// }
// }
