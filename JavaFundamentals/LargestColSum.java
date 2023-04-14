package JavaFundamentals;

import java.util.Scanner;

public class LargestColSum {
    // import java.util.Scanner;
    // public class Solution {
    
        public static void findLargest(int mat[][]){
            //Your code goes here
            int Lrow = Integer.MIN_VALUE;
            int idx1 = -1;
            int idx2 = -1;
            int Lcol = Integer.MIN_VALUE;
            int sum = 0;
            int rows = mat.length;
            int cols = mat[0].length;
            // boolean isRow = true;
            //row wise travesral
            for(int i = 0; i < rows; i++){
                sum  = 0;
                for(int j = 0; j < cols; j++){
                    sum += mat[i][j];
                }
            
                if(sum > Lrow){
                    Lrow = sum;
                    idx1 = i;

                }   


            }   
            

            //return
            //col wise traversal
                for(int i = 0; i < cols; i++){
                sum = 0;
            for(int j = 0; j < rows; j++){
                    sum += mat[j][i];
                }
                if(sum > Lcol){
                    Lcol = sum;
                    idx2 = i;

                    // isRow = false;
                }
            }

            
    
            if(Lrow >= Lcol){
                System.out.println("row" + idx1 + " " + Lrow);
            }
            else{
                System.out.println("column" + idx2 + " " + Lcol);
            }
        }
    
            public static void main(String[] args){
            try (Scanner s = new Scanner(System.in)) {
                int t = s.nextInt();
                while(t > 0){
                    int n = s.nextInt();
                    int m = s.nextInt();
                    int[][] mat = new int[n][m];
                    for(int i = 0; i < m; i++){
                        for(int j = 0; j < n; j++){
                            mat[i][j] = s.nextInt();
                        }
                    }
                    findLargest(mat);
                    // System.out.println(findLargestSum);
                    t--;
                }
            }
        }
    
    }























    // public static int largestCol(int[][] arr) {
    //     int rows = arr.length;
    //     int cols = arr[0].length;
    //     int largest = Integer.MIN_VALUE;
    //     for (int j = 0; j < cols; j++) {
    //         int sum = 0;
    //         for (int i = 0; i < rows; i++) {
    //             sum += arr[i][j];
    //         }
    //         if (sum > largest) {
    //             largest = sum;
    //         }
    //     }
    //     return largest;

    // }

    // public static int[][] takeInput() {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the number of rows: ");
    //     int rows = s.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     int cols = s.nextInt();
    //     int[][] arr = new int[rows][cols];
    //     System.out.println("Enter the elements of the 2-d array: ");
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             arr[i][j] = s.nextInt();

    //         }
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter the number of test cases: ");
    //     int t = s.nextInt();
    //     while (t > 0) {

    //         int[][] arr = takeInput();

    //         int largestColSum = largestCol(arr);
    //         System.out.println("The largest column sum is: ");
    //         System.out.println(largestColSum);
    //         t--;
    //     }
    // }
// }
