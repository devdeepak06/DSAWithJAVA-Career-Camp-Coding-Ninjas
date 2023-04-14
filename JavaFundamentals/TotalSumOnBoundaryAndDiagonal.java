//For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//First line of each test case or query contains an integer 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//Each of the ith row constitutes 'N' column values separated by a single space.
//Output Format :
//For each test case, print the total sum of elements in a single line separated by a single space.
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1 sec
//Sample Input 1:
//1
//3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 1:
//45
//Sample Input 2:
//2
//5
//1 2 3 4 6
//5 3 8 1 9
//7 6 5 4 3
//2 6 3 7 9
//1 4 7 2 6
//3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 2:
//83
//45
package JavaFundamentals;

import java.util.Scanner;

public class TotalSumOnBoundaryAndDiagonal {

    public static void totalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        // top & bottom row
        // for (int i = 0; i < n; i++) {
        // sum += mat[0][i];
        // sum += mat[n - 1][i];
        // }
        // // left & right column
        // for (int i = 1; i < n - 1; i++) {
        // sum += mat[i][0];
        // sum += mat[i][n - 1];
        // }
        // // diagonal
        // for (int i = 1; i < n - 1; i++) {
        // sum += mat[i][i];
        // sum += mat[i][n - 1 - i];
        // }
        // if (n % 2 != 0) {
        // sum -= mat[n / 2][n / 2];
        // }

        // Another Approach
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the size of the matrix");
                int n = s.nextInt();
                int[][] mat = new int[n][n];
                System.out.println("Enter the elements of the matrix");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        mat[i][j] = s.nextInt();
                    }
                }
                totalSum(mat);
                t--;
            }
        }
    }
}
