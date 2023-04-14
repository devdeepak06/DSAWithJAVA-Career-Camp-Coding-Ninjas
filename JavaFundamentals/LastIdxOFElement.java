//Last index Of Element
//

//Sample Input 1:
//8
//7 5 2 11 2 43 1 1
//2
//Sample Output 1:
//4

package JavaFundamentals;

import java.util.Scanner;

public class LastIdxOFElement {
    public static int lastIndex(int input[], int x) {
        // Write your code here
        int n = input.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = input[i];
        }
        for (int i = 0; i < n; i++) {
            if(temp[n - i - 1] == x){
                return n - i - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int x = s.nextInt();
            System.out.println(lastIndex(arr, x));
        }
    }
}
