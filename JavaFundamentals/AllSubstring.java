package JavaFundamentals;
import java.util.Scanner;
public class AllSubstring {
    
    public static void printSubstrings(String str){
        //Your code goes here
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                System.out.println(str.substring(i, j + 1));
            }
        }
    }
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            printSubstrings(str);
        }
    }
}
