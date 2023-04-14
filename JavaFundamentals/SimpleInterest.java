package JavaFundamentals;

import java.util.Scanner;
import java.lang.Math;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount: ");
            int principal = sc.nextInt();
            System.out.println("Enter the rate of interest: ");
            double rate = sc.nextDouble();
            System.out.println("Enter the time period: ");
            int time = sc.nextInt();
            int simpleInterest = (int) (Math.floor(principal * rate * time) / 100);
            System.out.println("The simple interest is: " + simpleInterest);
        }
    }
}
