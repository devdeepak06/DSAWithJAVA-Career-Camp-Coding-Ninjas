package Recursion;

import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int smallOutput = fact(n - 1);
        int output = n * smallOutput;
        return output;
    }
    public static void main(String[] args) {
        try (var s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(fact(n));
        }
    }
}
