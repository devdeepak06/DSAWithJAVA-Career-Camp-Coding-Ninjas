package JavaFundamentals;

import java.util.Scanner;

public class RowWiseSum {
    public static void rowWiseSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + " ");
            sum = 0;
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
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int[][] arr = takeInput();
                rowWiseSum(arr);
                t--;
            }
        }
    }
}