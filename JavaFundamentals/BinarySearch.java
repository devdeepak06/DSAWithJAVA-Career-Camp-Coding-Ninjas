package JavaFundamentals;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int n = s.nextInt();
            System.out.println("Enter the elements of the array");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter the number of test cases");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the element to be searched");
                int element = s.nextInt();
                int result = binarySearch(arr, element);
                if (result == -1) {
                    System.out.println("Element not found");
                } else {
                    System.out.println("Element found at index " + result);
                }
                t--;
            }
        }
    }
}
