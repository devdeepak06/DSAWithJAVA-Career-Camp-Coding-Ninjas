package JavaFundamentals;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int m1, m2, m3;
			int AverageMarks;
			int Sum;
			m1 = scan.nextInt();
			m2 = scan.nextInt();
			m3 = scan.nextInt();
			Sum = m1 + m2 + m3;
			AverageMarks = Sum/3;
			System.out.println(AverageMarks);
		}

	}

}
