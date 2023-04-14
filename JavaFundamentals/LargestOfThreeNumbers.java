package JavaFundamentals;

import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static int largestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        // Write your code here.
        int largest = firstNumber;
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        return largest;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            while (testCases-- > 0) {
                int firstNumber = scanner.nextInt();
                int secondNumber = scanner.nextInt();
                int thirdNumber = scanner.nextInt();
                int largest = largestOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
                System.out.println(largest);
            }
        }
    }    
}
