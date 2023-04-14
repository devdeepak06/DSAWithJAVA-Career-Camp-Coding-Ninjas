package JavaFundamentals;
public class BasicsOf2DArrays {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);
        // System.out.println(arr[1].length);
        // System.out.println(arr[2].length);
        int[][] arr = new int [2][2]; 
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
        } 
    }
}