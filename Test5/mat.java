//Write a code to perform different operations on matrix.
//1. Addition
// You are given two matrices return the addition of these two matrices.
//2. Multiplication
// You are given two matrices return the multiplication of these two matrices.
//3. Transpose
// You are given a matrix return the transpose of this matrix.
//4. Rotate by 90
// You are given a matrix return the matrix after rotating it by 90 degree.
//Input format :
//Line 1: Operation to be performed
//Line 2 : No of rows(n1) & No of columns(m1) (separated by space)
//Line 3 : Row 1 elements (separated by space)
//Line 4 : Row 2 elements (separated by space)
//Line 5 : and so on
//(If needed)
//Line n1+2 : No of rows(n2) & No of columns(m2) (separated by space)
//Line n1+3 : Row 1 elements (separated by space)
//Line n1+4 : Row 2 elements (separated by space)
//Line n1+5 : and so on
//Output format :
//Output depends on the operation performed
//Sample Input 1 :
//1
//2 2
//1 2
//1 3
//2 2
//4 3
//1 5
//Sample Output 1 :
//5 5
//2 8

package Test5;

import java.util.Scanner;

public class mat {
    int[][] matrix;

    mat(int[][] matrix) {
        this.matrix = matrix;
    }

    public static mat takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }
            return new mat(matrix);
        }
    }

    public static void print(mat matrix) {
        for (int i = 0; i < matrix.matrix.length; i++) {
            for (int j = 0; j < matrix.matrix[0].length; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static mat add(mat a, mat b) {
        int[][] matrix = new int[a.matrix.length][a.matrix[0].length];
        for (int i = 0; i < a.matrix.length; i++) {
            for (int j = 0; j < a.matrix[0].length; j++) {
                matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return new mat(matrix);
    }

    public static mat multiply(mat a, mat b) {
        int[][] matrix = new int[a.matrix.length][b.matrix[0].length];
        for (int i = 0; i < a.matrix.length; i++) {
            for (int j = 0; j < b.matrix[0].length; j++) {
                for (int k = 0; k < a.matrix[0].length; k++) {
                    matrix[i][j] += a.matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        return new mat(matrix);
    }

    public static mat transpose(mat m) {
        int[][] matrix = new int[m.matrix[0].length][m.matrix.length];
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[0].length; j++) {
                matrix[j][i] = m.matrix[i][j];
            }
        }
        return new mat(matrix);
    }

    public static mat rotate(mat m) {
        int[][] matrix = new int[m.matrix[0].length][m.matrix.length];
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0; j < m.matrix[0].length; j++) {
                matrix[j][m.matrix.length - 1 - i] = m.matrix[i][j];
            }
        }
        return new mat(matrix);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            mat a = takeInput();
            mat b = takeInput();
            switch (n) {
                case 1:
                    print(add(a, b));
                    break;
                case 2:
                    print(multiply(a, b));
                    break;
                case 3:
                    print(transpose(a));
                    break;
                case 4:
                    print(rotate(a));
                    break;
            }
        }
    }
}

