package JavaFundamentals;

import java.util.Scanner;

public class PushZerosToEnd {

    public static void pushZerosAtEnd(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                i++;
                j++;
            } else {

                i++;
            }

        }
        while (j < n) {
            arr[j] = 0;
            j++;
        }
        // else if(j < 0){
        // arr[j] = 0;
        // j++;
        // }
        // else{
        // return 0;
        // }

    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                pushZerosAtEnd(arr);
                printArray(arr);
                t--;
            }
        }
    }
}

// import java.util.Scanner;
// public class PushZerosToEnd {
// public static void printArray(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// public static void pushZerosToEnd(int[] arr) {
// int n = arr.length;
// int count = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] != 0) {
// arr[count] = arr[i];
// count++;
// }
// }
// while (count < n) {
// arr[count] = 0;
// count++;
// }
// }
// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// System.out.println("Enter the number of test cases");
// int t = sc.nextInt();
// while (t > 0) {
// System.out.println("Enter the size of the array");
// int n = sc.nextInt();
// System.out.println("Enter the elements of the array");
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// pushZerosToEnd(arr);
// System.out.println("The array after pushing zeros to the end is");
// printArray(arr);
// t--;
// }
// }
// }
// }
