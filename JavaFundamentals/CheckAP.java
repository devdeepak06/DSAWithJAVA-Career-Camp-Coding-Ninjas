// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.

// Input Format :
// Line 1 : Integer n
// Line 2 : n integers (separated by space)
// Output Format :

// true or false
package JavaFundamentals;
import java.util.Scanner;
public class CheckAP{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] input = new int[n];
            for(int i = 0; i < n; i++) {
                input[i] = s.nextInt();
            }
            System.out.println(checkAP(input));
        }

    }
    public static boolean checkAP(int[]Input){
        int i, j , k;
        int count = 0;
        for(i = 0; i < Input.length - 2; i++){
            for(j = i + 1; j < Input.length - 1; j++){
                for(k = j + 1; k < Input.length; k++){
                    if(Input[i] + Input[k] == 2 * Input[j]){
                        count++;
                    }
                }
            }
        }
        if(count > 0){
            return true;
        }
        else{
            return false;
        }

    }
}



