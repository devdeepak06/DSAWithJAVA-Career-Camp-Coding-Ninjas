package JavaFundamentals;

import java.util.Scanner;

public class PrintNameAndAge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your name is " + name + " and your age is " + age);
        }
    }
}
