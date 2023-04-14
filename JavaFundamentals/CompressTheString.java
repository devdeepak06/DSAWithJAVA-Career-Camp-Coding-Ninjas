//If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
//The string is compressed only when the repeated character count is more than 1.

//Input Format
//A String

//Constraints
//1 <= length of string <= 1000

//Output Format
//Compressed String

//Sample Input
//aaabbccdsa

//Sample Output
//a3b2c2dsa

//Explanation
//In the given string "aaabbccdsa", 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times. So the compressed string is "a3b2c2dsa".
package JavaFundamentals;
import java.util.*;
public class CompressTheString {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            System.out.println(compress(str));
        }
    }
    public static String compress(String str){
        String ans = "";
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
            }
            else{
                if(count > 1){
                    ans += str.charAt(i) + "" + count;
                }
                else{
                    ans += str.charAt(i);
                }
                count = 1;
            }
        }
        return ans;
    }
}