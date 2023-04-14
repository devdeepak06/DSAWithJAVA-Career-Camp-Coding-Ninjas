package Test6;

import java.util.Scanner;

public class RottenOrange {
    public static int orangesRotting(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = grid[i][j];
            }
        }
        while (true) {
            boolean flag = false;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 2) {
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            temp[i - 1][j] = 2;
                            flag = true;
                        }
                        if (i + 1 < row && grid[i + 1][j] == 1) {
                            temp[i + 1][j] = 2;
                            flag = true;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            temp[i][j - 1] = 2;
                            flag = true;
                        }
                        if (j + 1 < col && grid[i][j + 1] == 1) {
                            temp[i][j + 1] = 2;
                            flag = true;
                        }
                    }
                }
            }
            if (!flag) {
                break;
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    grid[i][j] = temp[i][j];
                }
            }
            count++;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int row = s.nextInt();
            int col = s.nextInt();
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    grid[i][j] = s.nextInt();
                }
            }
            System.out.println(orangesRotting(grid));
        }

    }
}
