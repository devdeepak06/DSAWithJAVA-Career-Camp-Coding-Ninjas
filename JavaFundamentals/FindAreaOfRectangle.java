package JavaFundamentals;

import java.util.Scanner;

public class FindAreaOfRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of rectangle: ");
            int length = sc.nextInt();
            System.out.println("Enter the breadth of rectangle: ");
            int breadth = sc.nextInt();
            int area = length * breadth;
            System.out.println("The area of rectangle is: " + area);
        }
    }
}
