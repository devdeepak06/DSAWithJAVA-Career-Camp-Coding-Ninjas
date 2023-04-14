package JavaFundamentals;

import java.util.Scanner;

public class PrintLikeAWave {
	public static void wavePrint(int mat[][]) {
		// Your code goes here
		if (mat.length == 0) {
			System.out.println(" ");
		} else {
			for (int i = 0; i < mat[0].length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < mat.length; j++) {
						System.out.print(mat[j][i] + " ");
					}
				} else {
					for (int j = mat.length - 1; j >= 0; j--) {
						System.out.print(mat[j][i] + " ");
					}
				}
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
				wavePrint(mat);
				System.out.println();
				t--;
			}
		}
	}
}