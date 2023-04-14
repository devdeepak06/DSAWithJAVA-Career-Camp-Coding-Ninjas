//Find the kth largest and smallest element in an array
package JavaFundamentals;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class FindLargestAndSmallest {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        // Write your code here

        Collections.sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr.get(k - 1));
        ans.add(arr.get(n - k));
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(s.nextInt());
            }
            int k = s.nextInt();
            ArrayList<Integer> ans = kthSmallLarge(arr, n, k);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
