package Backtracking;

// public class RatInMazePrintAllPaths{
//     public static void ratInAMaze(int maze[][], int n) {
//         int sol[][] = new int[n][n];
//         solveMaze(maze, 0, 0, sol, n);
//     }

//     public static void solveMaze(int maze[][], int i, int j, int sol[][], int n) {
//         // Check if i, j cell is valid or not
//         if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || sol[i][j] == 1) {
//             return;

//         }
//         // Include the cell in current path
//         sol[i][j] = 1;
//         // Destination cell
//         if (i == n - 1 && j == n - 1) {
//             printSolution(sol, n);
//             sol[i][j] = 0;
//             return;
//         }
//         // Explore furthe in all directions
//         // top
//         solveMaze(maze, i - 1, j, sol, n);
//         // right
//         solveMaze(maze, i, j + 1, sol, n);
//         // Down
//         solveMaze(maze, i + 1, j, sol, n);
//         // left
//         solveMaze(maze, i, j - 1, sol, n);
//         sol[i][j] = 0;
//         return;

//     }

//     public static void printSolution(int sol[][], int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(sol[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }


//     public static void main(String[] args) {
//         int maze[][] = {{1, 0, 0, 0},
//                         {1, 1, 0, 1},
//                         {1, 1, 0, 0},
//                         {0, 1, 1, 1}};
//         ratInAMaze(maze, 4);


// 	}
// }

public class RatInMazePrintAllPaths{
    public static void ratInAMaze(int maze[][], int n) {
        int sol[][] = new int[n][n];
        solveMaze(maze, 0, 0, sol);
    }

    public static void solveMaze(int maze[][], int i, int j, int sol[][]) {
        int n = maze.length;
        // Check if i, j cell is valid or not
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || sol[i][j] == 1) {
            return;

        }
        // Include the cell in current path
        sol[i][j] = 1;
        // Destination cell
        if(i == n-1 && j == n-1){
        //    for(int row = 0; row < n; row++){
        //         for(int col = 0; col < n; col++){
        //              System.out.print(sol[row][col] + " ");
        //         }
        //         System.out.println();
        //    }
        //       System.out.println();
        printSolution(sol, n);
            sol[i][j] = 0;
            return;
        }
        // Explore furthe in all directions
        // top
        solveMaze(maze, i - 1, j, sol);
        // right
        solveMaze(maze, i, j + 1, sol);
        // Down
        solveMaze(maze, i + 1, j, sol);
        // left
        solveMaze(maze, i, j - 1, sol);
        sol[i][j] = 0;
        return;

    }

    public static void printSolution(int sol[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        ratInAMaze(maze, 4);


	}
}