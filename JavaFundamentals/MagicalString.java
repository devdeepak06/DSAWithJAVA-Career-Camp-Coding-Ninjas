//Utkarsh has been given a binary string s consisting of only 0's and 1's. He considers a binary string magical if it can be divided into three parts(Possibly empty) in such a way that the first and third part conatins only thwe letter '0' and the second part only contain the letter '1'.
//Note that the order of the letters cannot be changed.
//Your task is to remove some characters(possibly zero) from the binary string s(without changing the order) so that it becomes magical. You have to output the  maximum length of the magical binary string that can be obtained.
//Input Format:
//The first and only line of input contains a binary string s consisting of only '0' and '1'.
//Output Format:
//Print in a single line one integer value - the maximum length of the magical binary string that can be obtained.
//Constraints:
//1 <= s <= 10^5
//Time Limit: 1 second
//Sample Input 1:
//01010
//Sample Output 1:
//4
//Sample Input 2:
//010101
//Sample Output 2:
//5
package JavaFundamentals;

import java.util.Scanner;

public class MagicalString {
    public static int magicalString(String str) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(magicalString(str));
        }
    }
}


