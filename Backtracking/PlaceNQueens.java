package Backtracking;

public class PlaceNQueens {
    public static void placeNQueens(int n) {
        int board[][] = new int[n][n];
        placeQueens(board, 0, n);
    }

    public static void placeQueens(int board[][], int row, int n) {
        if (row == n) {
            printSolution(board, n);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                placeQueens(board, row + 1, n);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int board[][], int row, int col, int n) {
        // Check for column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // Check for left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check for right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printSolution(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            // System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        placeNQueens(4);

    }
}