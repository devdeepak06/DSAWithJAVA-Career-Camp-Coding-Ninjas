//Array Intersection 
//Sample Input 1 :
//2
//6
//2 6 8 5 4 3
//4
//2 3 4 7
//2
//10 10
//1
//10
//Sample Output 1 :
//2 3 4
//10
package JavaFundamentals;
import java.util.Scanner;

public class ArrayIntersection {
    public static void intersections(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		while(i < arr1.length && j < arr2.length) {
			if(i > 0 && arr1[i] == arr1[i - 1]) {
				i++;
				continue;
			}
			if(arr1[i] < arr2[j]) {
				i++;
				j++;
			} else if(arr1[i] > arr2[j]) {
				i++;
				j++;
			} else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}


	}
}
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int t = s.nextInt();
			while(t > 0) {
				int n = s.nextInt();
				int[] arr1 = new int[n];
				for(int i = 0; i < n; i++) {
					arr1[i] = s.nextInt();
				}
				int m = s.nextInt();
				int[] arr2 = new int[m];
				for(int i = 0; i < m; i++) {
					arr2[i] = s.nextInt();
				}
				intersections(arr1, arr2);
				System.out.println();
				t--;
			}
		}
	}
}
