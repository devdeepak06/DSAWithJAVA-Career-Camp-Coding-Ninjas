package JavaFundamentals;

import java.util.Scanner;

public class PrintSpiral {
    public static void spiralPrint(int mat[][]) {
        // Your code goes here
        int n = mat.length;
        int m = mat[0].length;
        int i, k = 0, l = 0;
        while (k < n && l < m) {
            for (i = l; i < m; i++) {
                System.out.print(mat[k][i] + " ");
            }
            k++;
            for (i = k; i < n; i++) {
                System.out.print(mat[i][m - 1] + " ");
            }
            m--;
            if (k < n) {
                for (i = m - 1; i >= l; i--) {
                    System.out.print(mat[n - 1][i] + " ");
                }
                n--;
            }
            if (l < m) {
                for (i = n - 1; i >= k; i--) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static int[][] takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = s.nextInt();
                }
            }

            return mat;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int[][] mat = takeInput();
                spiralPrint(mat);
                System.out.println();
                t--;
            }
        }
    }
}
