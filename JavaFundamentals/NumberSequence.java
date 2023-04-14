//Check number sequence
// you are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two sequences S1 and S2 such that the first element of S1 is 1, the last element of S2 is n and for all i from 1 to n - 1, either Si + 1 = Si + 1 or Si + 1 = Si + 2.
//
// Input Format:
// line 1: Integer n
// line 2 and onwards: n integers, elements of sequence S
//
// output Format:
//true or false
//

package JavaFundamentals;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            boolean flag = true;
            int i = 0;
            while (i < n - 1) {
                if (arr[i] + 1 == arr[i + 1]) {
                    i++;
                } else if (arr[i] + 2 == arr[i + 1]) {
                    i += 2;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

}
