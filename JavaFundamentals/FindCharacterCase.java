package JavaFundamentals;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char c = s.next().charAt(0);
			if(c >= 65 && c <= 90)
				System.out.println(1);
			else if(c >= 97 && c <= 122)
				System.out.println(0);
			else
				System.out.println(-1);
		}
	}
}
