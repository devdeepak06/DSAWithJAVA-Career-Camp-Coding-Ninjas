package JavaFundamentals;

import java.util.Scanner;

public class InputAndPrint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();
            System.out.println("Enter the number of colmuns");
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];
            // for (int i = 0; i < rows; i++) {
            // for (int j = 0; j < cols; j++) {
            // System.out.println("Enter the element at position " + i + " row and " + j + "
            // Column");
            // arr[i][j] = sc.nextInt();
            // }
            // }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}