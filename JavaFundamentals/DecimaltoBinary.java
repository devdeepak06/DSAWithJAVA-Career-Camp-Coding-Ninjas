package JavaFundamentals;
import java.util.Scanner;

public class DecimaltoBinary {
	public void Binary(int num) {
		if (num == 0) {
			System.out.print("0");
			return;
		}
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String a[]) {
		try (Scanner sc = new Scanner(System.in)) {
			DecimaltoBinary obj = new DecimaltoBinary();
			int n = sc.nextInt();
			obj.Binary(n);
		}
	}
}

// decimal to binary
// do not use any inbuilt function
// take input as integer
// print the binary equivalent of the number
// input: 12
// output: 1100

// import java.util.Scanner;

// public class DecimaltoBinary{
// public void Binary(int n){
// if(n==0){
// return;
// }
// Binary(n/2);
// System.out.print(n%2);
// }
// public static void main(String[] args){
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// DecimaltoBinary obj = new DecimaltoBinary();
// obj.Binary(n);
// }

// }