package Backtracking;

public class RatInMaze {
    public static boolean ratInAMaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];
        return solveMaze(maze, 0, 0, sol);
    }

    public static boolean solveMaze(int maze[][], int i, int j, int sol[][]) {
        int n = maze.length;
        // Check if i, j cell is valid or not
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || sol[i][j] == 1) {
            return false;

        }
        // Include the cell in current path
        sol[i][j] = 1;
        // Destination cell
        if (i == n - 1 && j == n - 1) {
            return true;
        }
        // Explore furthe in all directions
        // top
        if (solveMaze(maze, i - 1, j, sol)) {
            return true;
        }
        // right
        if (solveMaze(maze, i, j + 1, sol)) {
            return true;
        }
        // Down
        if (solveMaze(maze, i + 1, j, sol)) {
            return true;
        }
        // left
        if (solveMaze(maze, i, j - 1, sol)) {
            return true;
        }
        return false;

        // if(i == n-1 && j == n-1){
        //     sol[i][j] = 1;
        //     return true;
        // }
        // if (isSafe(maze, i, j)) {
        // sol[i][j] = 1;
        // if (solveMaze(maze, i + 1, j, sol)) {
        // return true;
        // }
        // if (solveMaze(maze, i, j + 1, sol)) {
        // return true;
        // }
        // sol[i][j] = 0;
        // return false;
        // }
        // return false;
    }

    public static boolean isSafe(int maze[][], int i, int j) {
        int n = maze.length;
        if (i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // ratInAMaze(maze, 3);
        System.out.println(ratInAMaze(maze));

    }
}