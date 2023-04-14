package JavaFundamentals;

import java.util.Scanner;

public class FunctionsWith2DArrays {
    public static void print2DArrays(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            int rows = s.nextInt();
            int cols = s.nextInt();
            int[][] arr = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = s.nextInt();

                }

            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        print2DArrays(arr);
    }
}
