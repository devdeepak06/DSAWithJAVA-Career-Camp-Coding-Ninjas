package JavaFundamentals;

import java.util.Scanner;

public class LargestRowOrColumn {

    public static void findLargest(int[][] mat) {
        int Lrow = Integer.MIN_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        int Lcol = Integer.MIN_VALUE;
        int sum = 0;
        int rows = mat.length;
        int cols = mat[0].length;

        // row wise travesral
        for (int i = 0; i < rows; i++) {
            sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }

            if (sum > Lrow) {
                Lrow = sum;
                idx1 = i;

            }

        }
        // col wise traversal
        for (int i = 0; i < cols; i++) {
            sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += mat[j][i];
            }
            if (sum > Lcol) {
                Lcol = sum;
                idx2 = i;
            }
        }

        if (Lrow >= Lcol) {
            System.out.println("row " + idx1 + " " + Lrow);
        } else if (Lcol >= Lrow) {
            System.out.println("column " + idx2 + " " + Lcol);
        }
		else{
			System.out.println("row 0 -2147483648");
		}
    }

    public static int[][] takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int rows = s.nextInt();
            System.out.println("Enter the number of columns: ");
            int cols = s.nextInt();

            int[][] arr = new int[rows][cols];
            System.out.println("Enter the elements of the array: ");
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
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                int[][] arr = takeInput();
                System.out.println("In row or column the largest is: ");
                findLargest(arr);
                t--;
            }
        }
    }
}