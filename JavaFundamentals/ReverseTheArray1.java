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
import java.util.ArrayList;

public class ReverseTheArray1 {

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here
        int n = arr.size();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            temp.add(arr.get(i));
        }
        for (int i = 0; i < n; i++) {
            if (i < m) {
                arr.set(i, temp.get(i));
            } else {
                arr.set(i, temp.get(n - i + m - 1));
            }
        }

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t > 0) {
                int m = sc.nextInt();
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for (int i = 0; i < m; i++) {
                    arr.add(sc.nextInt());
                }
                reverseArray(arr, m);
                for (int i = 0; i < m; i++) {
                    System.out.print(arr.get(i) + " ");
                }
                t--;
            }
        }
    }
}
