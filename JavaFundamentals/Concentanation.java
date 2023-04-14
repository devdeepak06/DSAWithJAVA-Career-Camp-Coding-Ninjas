package JavaFundamentals;
import java.util.Scanner;

public class Concentanation {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String str = s.next();
			int a = s.nextInt();
			System.out.print(str + " " + a);
		}
		
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		String str = s.next();
//		System.out.print(a);
//		System.out.println(str);
		
//		Scanner s = new Scanner(System.in);
//		String str;
//		str = s.next();
//		System.out.println(str);
	}

}
