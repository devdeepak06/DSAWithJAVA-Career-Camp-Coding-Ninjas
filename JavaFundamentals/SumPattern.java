//print the sum pattern using while loop
//for example, if the user enters n = 5, the output should be:
//1 = 1
//1 + 2 = 3
//1 + 2 + 3 = 6
//1 + 2 + 3 + 4 = 10
//1 + 2 + 3 + 4 + 5 = 15
//and n is the number of rows
//and the sum of the numbers in each row is the number in the last column
//and the numbers in each row are separated by a space
package JavaFundamentals;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            int number = 1;
            while (number <= rows) {
                int count = 1;
                int sum = 0;
                while (count <= number) {
                    System.out.print(count);
                    sum = sum + count;
                    if (count < number) {
                        System.out.print(" + ");
                    }
                    count++;
                }
                System.out.print(" = " + sum);
                System.out.println();
                number++;
            }
        }
    }
}
