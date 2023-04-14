package JavaFundamentals;
import java.util.Scanner;

public class CountWord {
        public static int countWords(String str){
        //Your code goes here
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            System.out.println(countWords(str));
        }
    }    
}
