//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//Your task is to populate the array using the integers values in the range 1 to N(both inclusive) in the order 1 3 5 ...... 6 4 2.
//Note:
//You need not print the array. You only need to populate it.
//Input Format:
//The first line contains an integer 't' denoting the number of test cases or queries to be run. Then the test cases follow.
//The first and the only line of each test case or query contains an integer 'N'.
//Output Format:
//For each test case, print the elements of the array separated by a single space.
//Output for every test case will be printed in a separate line.
//Constraints:
//1 <= t <= 10^2
//0 <= N <= 10^4
//Time Limit: 1sec
//Sample Input 1:
//1
//6
//Sample Output 1:
//1 3 5 6 4 2
//Sample Input 2:
//2
//9
//4
//Sample Output 2:
//1 3 5 7 9 8 6 4 2
//1 3 4 2
package JavaFundamentals;
import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void arrange(int[] arr, int x) {
        int start = 0;
        int end = x - 1;
        int value = 1;
        while (start <= end) {
            arr[start] = value;
            value++;
            start++;
            if (start <= end) {
                arr[end] = value;
                value++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int testCase = s.nextInt();
            while (testCase > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                arrange(arr, n);
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                testCase--;
            }
        }
    }
}