// print the following pattern
// 1
//232
//34543
//4567654
//567898765
package JavaFundamentals;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            int number = 1;

            while (number <= rows) {
                int space = 1;
                while (space <= rows - number) {
                    System.out.print(" ");
                    space++;
                }
                int count = 1;
                int num = number;
                while (count <= number) {
                    System.out.print(num);
                    num++;
                    count++;
                }
                num = num - 2;
                count = 1;
                while (count < number) {
                    System.out.print(num);
                    num--;
                    count++;
                }
                System.out.println();
                number++;
            }
        }
    }
}